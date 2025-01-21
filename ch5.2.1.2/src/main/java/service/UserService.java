package service;

import org.springframework.stereotype.Component;
import repository.CommentRepository;

@Component
public class UserService {
    private final CommentRepository commentRepository;

    public UserService(CommentRepository commentRepository){
        this.commentRepository = commentRepository;
    }

    public CommentRepository getCommentRepository(){
        return commentRepository;
    }
}
