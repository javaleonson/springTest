package test.minstrels;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 用注解实现的自动吟游机器
 */
@Aspect
public class MinstrelsyMachine {
    @Before("execution(* test.knights.Knight.*(..))")
    public void before() {
        System.out.println("----before record----");
    }

    @After("execution(* test.knights.Knight.*(..))")
    public void after() {
        System.out.println("----after record----");
    }
    @Around("execution(* test.knights.Knight.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("----around before----");
        System.out.println("签名"+joinPoint.getSignature());
        System.out.println("----around after----");
        return joinPoint.proceed();
    }
}
