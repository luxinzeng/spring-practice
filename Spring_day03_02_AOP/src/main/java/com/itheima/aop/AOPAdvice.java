package com.itheima.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

//1.制作通知类，在类中定义一个方法用于完成共性功能
public class AOPAdvice {

    public void before(JoinPoint jp){
        Object[] args = jp.getArgs();//使用getArgs方法
        System.out.println("before..."+args[0]);
    }//aop传参的两种方式，1.创建JoinPoint对象

    public void before1(int x){
    //aop传参的两种方式，2.在方法中传入参数，在.xml中
        System.out.println("before(int)..."+ x);
    }

    public void after(){
        System.out.println("after...");
    }
    public void afterReturing(Object ret){
        System.out.println("afterReturing..."+ret);
    }
    public void afterThrowing(){
        System.out.println("afterThrowing...");
    }
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before");
        //该方法的使用需要搭配异常处理
        Object ret = pjp.proceed();
        System.out.println("around after"+ret);
        return ret;
    }
}
