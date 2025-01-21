package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CommentService;
import service.UserService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var s1 = context.getBean(CommentService.class);
        var s2 = context.getBean(UserService.class);

        boolean b = s1.getCommentRepository() == s2.getCommentRepository();
        System.out.println(b);
    }
}
