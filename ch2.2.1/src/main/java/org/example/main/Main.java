package org.example.main;

import org.example.config.ProjectConfig;
import org.example.obj.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p = context.getBean("bobo",Parrot.class);
        System.out.println(p.getName());
    }
}