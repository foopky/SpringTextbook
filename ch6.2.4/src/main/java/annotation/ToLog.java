package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 리텐션 정책을 RUNTIME으로 설정하여 다른 사람이 애너테이션을 가로챌 수 있도록 함
@Retention(RetentionPolicy.RUNTIME)
// 애너테이션을 사용할 수 있는 요소 지장
@Target(ElementType.METHOD)
public @interface ToLog {
}
