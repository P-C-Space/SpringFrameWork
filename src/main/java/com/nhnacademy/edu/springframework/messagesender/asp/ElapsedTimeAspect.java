package com.nhnacademy.edu.springframework.messagesender.asp;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class ElapsedTimeAspect {

    @Around("execution(* com.nhnacademy.edu.springframework.messagesender.message.MessageSender.sendMessage(..))")
    public Object log(ProceedingJoinPoint pjp) throws Throwable {
        StopWatch stopWatch = new StopWatch();

        Object returnValue;
        try{
            stopWatch.start();
            returnValue = pjp.proceed();
            return returnValue;

        }finally {
            stopWatch.stop();
            System.out.println(stopWatch.prettyPrint());
        }
    }
}
