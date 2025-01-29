package aspect;

import comment.Comment;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    // 어떤 메서드를 가로챌지 정의 ( 포인트 컷 )
    // AspectJ 포인트컷 표현식
    // 애스펙트를 @ToLog로 애너테이션된 메서드에 적용, 어노테이션의 위치도 작성해야 함

//    @AfterReturning(value = "@annotation(annotation.ToLog)", returning = "returnByMethod")
//    public Object log(JoinPoint joinPoint, Object returnByMethod) throws Throwable{
//        String methodName = joinPoint.getSignature().getName();
//
//        //가로채려는 메서드의 매개변수 받아오기
//        Object [] arguments = joinPoint.getArgs();
//        logger.info("Method " + methodName + " with parameters " + Arrays.asList(arguments) + " will execute");
//
//
//        // 실제 가로채는 메서드에 위임 (조인트 포인트)
//        logger.info("Method executed and returned " + returnByMethod);
//
//        // 가로챈 메서드에서 반환된 값을 로깅하지만 호출자에게는 다른 값을 반환
//        return returnByMethod;
//    }
    @AfterThrowing(value = "@annotation(annotation.ToLog)",throwing = "e")
    public void log(JoinPoint joinPoint, Throwable e){
        logger.info("ERROR: " + e.toString());
    }
}
