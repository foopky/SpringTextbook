package service;

import org.springframework.stereotype.Component;
import repository.CommentRepository;

@Component
public class CommentService {
    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository){
        this.commentRepository = commentRepository;
    }

    public CommentRepository getCommentRepository(){
        return commentRepository;
    }
}
