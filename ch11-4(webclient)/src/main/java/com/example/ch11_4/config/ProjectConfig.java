package com.example.ch11_4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ProjectConfig {
    // WebClient 빈 생성, 스프링 컨텍스트에 추가
    @Bean
    public WebClient webClient(){
        return WebClient
                .builder()
                .build();
    }
}
