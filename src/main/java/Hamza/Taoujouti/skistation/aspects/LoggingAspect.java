package Hamza.Taoujouti.skistation.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspect {
    @Before("execution(* Hamza.Taoujouti.skistation.services.*.*(..))")
    public void logInMethod(JoinPoint joinPoint){
        log.info("In Method " + joinPoint.getSignature().getName());
    }

    @After("execution(* Hamza.Taoujouti.skistation.services.*.*(..))")
    public void logOutMethod(JoinPoint joinPoint){
        log.info("Out of Method " + joinPoint.getSignature().getName() );
    }
}
