package com.example.ch11_2.proxy;

import com.example.ch11_2.object.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Component
public class PaymentsProxy {
    @Autowired
    private final RestTemplate rest;

    @Value("${name.service.url}")
    private String paymentsServiceUrl;

    public PaymentsProxy(RestTemplate rest) {
        this.rest = rest;
    }

    public Payment createPayment(Payment payment){
        String uri = paymentsServiceUrl + "/payment";

        // HttpHeader 정의
        HttpHeaders headers = new HttpHeaders();
        headers.add("requestId", UUID.randomUUID().toString());

        //HttpEntity 정의
        HttpEntity<Payment> httpEntity = new HttpEntity<>(payment, headers);

        //rest.exchange를 통해 HTTP 요청, 매개변수로 uri, HttpMethod, httpEntity, 응답 타입을 가짐
        ResponseEntity<Payment> response = rest.exchange(uri, HttpMethod.POST, httpEntity, Payment.class);

        return response.getBody();
    }
}


