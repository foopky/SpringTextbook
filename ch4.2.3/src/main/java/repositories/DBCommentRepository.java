package repositories;

import obj.Comment;
import org.springframework.stereotype.Repository;

// 리포지터리 책임을 표시하기 위해 @Repository 애너테이션 사용
@Repository
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment){
        System.out.println("Storing Comment: " + comment.getText());
    }
}
