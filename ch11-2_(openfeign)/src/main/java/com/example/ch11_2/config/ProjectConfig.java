package com.example.ch11_2.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.example.ch11_2.proxy")
public class ProjectConfig {
}
