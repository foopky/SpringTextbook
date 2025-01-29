package main;

import comment.Comment;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CommonService;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = c.getBean(CommonService.class);

        Comment comment = new Comment();
        comment.setText("Demo Content");

        service.publishComment(comment);
    }
}