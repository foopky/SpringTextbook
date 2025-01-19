package main;

import config.ProjectConfiguration;
import obj.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import proxies.CommentNotificationProxy;
import proxies.EmailCommentNotificationProxy;
import repositories.CommentRepository;
import repositories.DBCommentRepository;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
//      의존성 인스턴스를 생성하지 않아도 자동으로 의존성 연결
        Comment comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComemnt(comment);
    }
}