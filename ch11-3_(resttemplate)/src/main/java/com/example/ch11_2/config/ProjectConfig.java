package com.example.ch11_2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan(basePackages = "com.example.ch11_2.proxy")
public class ProjectConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
