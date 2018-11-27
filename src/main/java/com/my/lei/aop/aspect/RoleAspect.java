package com.my.lei.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class RoleAspect {
    @Pointcut("execution(* com.my.lei.aop.service.impl.RoleServiceImpl.printRole(..))")
    public void print() {

    }

    @Before("execution(* com.my.lei.aop.*.*.*.printRole(..)) && within(com.my.lei.aop.service.impl.*)")
    public void before(){
        System.out.println("before...");
    }

    @After("print()")
    public void after() {
        System.out.println("after...");
    }

    @AfterReturning("print()")
    public void afterReturning() {
        System.out.println("afterReturning...");
    }

    @AfterThrowing("print()")
    public void afterThrowing() {
        System.out.println("afterThrowing...");
    }

    @Around("print()")
    public void around(ProceedingJoinPoint joinPoint) {
        System.out.println("around before...");
        try {
            joinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("around after...");
    }
}
