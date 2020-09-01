package com.jackson.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logging {

    @Pointcut("execution(* com.jackson.service.UserService.*(..))")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void beforeAdvice() {
        System.out.println("Going to setup stedent profile.");
    }

    @After("pointCut()")
    public void afterAdvice() {
        System.out.println("Stedent profile has been setup.");
    }

    @AfterReturning(value = "pointCut()", returning = "retVal")
    public void afterReturningAdvice(Object retVal) {
        System.out.println("Returning: " + retVal.toString());
    }

    @AfterThrowing(value = "pointCut()", throwing = "ex")
    public void AfterThrowingAdvice(IllegalArgumentException ex) {
        System.out.println("There has been an exception: " + ex.toString());
    }
}
