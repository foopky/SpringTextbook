package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    // 어떤 메서드를 가로챌지 정의 ( 포인트 컷 )
    // AspectJ 포인트컷 표현식
    @Around("execution(* service.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info("Method will execute");
        // 실제 가로채는 메서드에 위임 (조인트 포인트)
        joinPoint.proceed();
        logger.info("Method executed");
    }
}
