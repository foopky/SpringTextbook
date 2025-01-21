package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var s1 = context.getBean(CommentService.class);
        var s2 = context.getBean(CommentService.class);

        boolean b = s1 == s2;
        System.out.println(b);
    }
}
