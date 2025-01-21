package service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;


@Service
@Lazy // 빈을 참조 할 때만 빈이 생성된다.
public class CommentService {
    public CommentService() {
        System.out.println("CommentService instance created!");
    }
}
