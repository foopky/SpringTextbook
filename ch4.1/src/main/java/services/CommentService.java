package services;

import obj.Comment;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;

public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;
    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy){
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }
    public void publishComemnt(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
