package service;

import annotation.ToLog;
import comment.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommonService {
    private Logger logger = Logger.getLogger(CommonService.class.getName());

    @ToLog
    public String publishComment(Comment comment){
        logger.info("Publishing comment: " + comment.getText());
        return "SUCCESS";
    }
}
