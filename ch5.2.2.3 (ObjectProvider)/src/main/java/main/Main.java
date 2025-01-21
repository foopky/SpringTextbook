package main;

import config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repository.PrototypeRepository;
import service.SingletonService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var s1 = context.getBean(SingletonService.class);
        var s2 = context.getBean(SingletonService.class);

        System.out.println(s1.logic());
        System.out.println(s2.logic());
    }
}