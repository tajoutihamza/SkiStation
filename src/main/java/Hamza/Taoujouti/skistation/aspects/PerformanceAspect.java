package Hamza.Taoujouti.skistation.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class PerformanceAspect {
    @Around("execution(* Hamza.Taoujouti.skistation.services.*.*(..))")
    public Object executionTime(ProceedingJoinPoint pjp) throws Throwable{
        long t1 = System.currentTimeMillis();
        Object object = pjp.proceed();
        long executionTime = System.currentTimeMillis() -t1;
        String methodName = pjp.getSignature().getName();
        log.info("The runtime of method ( " + methodName + " ) = " + executionTime + " milliseconds.");
        return object;
    }
}
