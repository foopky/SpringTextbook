package service;

import comment.Comment;
import annotation.ToLog;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());
    public void publishComment(Comment comment){
        logger.info("Publishing comment: " + comment.getText());
    }

    // 가로채려는 메서드에 대해 커스텀 애너테이션 사용
    @ToLog
    public void deleteComment(Comment comment){
        logger.info("Deleting comment: " + comment.getText());
    }
    public void editComment(Comment comment){
        logger.info("Editing comment: " + comment.getText());
    }
}
