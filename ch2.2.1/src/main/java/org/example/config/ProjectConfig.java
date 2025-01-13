package org.example.config;

import org.example.obj.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Bean(name="koko")
    @Primary
    Parrot parrot1(){
        var p = new Parrot();
        p.setName("koko");
        return p;
    }

    @Bean(value="toto")
    Parrot parrot2(){
        var p = new Parrot();
        p.setName("toto");
        return p;
    }

    @Bean("bobo")
    Parrot parrot3(){
        var p = new Parrot();
        p.setName("bobo");
        return p;
    }

    @Bean
    String hello(){
        return "Hello";
    }
}
