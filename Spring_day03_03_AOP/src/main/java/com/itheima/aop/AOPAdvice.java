package com.itheima.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Aspect//切面
public class AOPAdvice {
//    @Pointcut("execution(* *..*save(..))")
//    public void pt(){};

    @Before("AOPPointcut.pt1()")
    public void before(JoinPoint jp){
        Object[] args = jp.getArgs();
        System.out.println("前置before..."+args[0]);
    }


    public void before1(){
    //aop传参的两种方式，2.在方法中传入参数，在.xml中
        System.out.println("before(int)..." );
    }

    @After("AOPPointcut.pt1()")
    public void after(){
        System.out.println("after...");
    }
    //注解开发，引入参数
    @AfterReturning(value = "AOPPointcut.pt1()",returning = "ret")
    public void afterReturing(Object ret){
        System.out.println("afterReturing..."+ret);
    }
    @AfterThrowing("AOPPointcut.pt1()")
    public void afterThrowing(){
        System.out.println("afterThrowing...");
    }
//    @Around("pt()")
//    public Object around(ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println("around before");
//        //该方法的使用需要搭配异常处理
//        Object ret = pjp.proceed();
//        System.out.println("around after"+ret);
//        return ret;
//    }
}
