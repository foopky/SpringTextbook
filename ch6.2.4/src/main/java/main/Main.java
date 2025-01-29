package main;

import comment.Comment;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CommentService;

import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Demo comment");
        comment.setAuthor("Natasha");;

        // publishComment() 메서드의 반환 값을 출력

        service.publishComment(comment);
        service.deleteComment(comment);
        service.editComment(comment);
    }
}