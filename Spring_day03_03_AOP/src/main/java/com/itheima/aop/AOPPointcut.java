package com.itheima.aop;

import org.aspectj.lang.annotation.Pointcut;

public class AOPPointcut {
    @Pointcut("execution(* *..*save(..))")
    public void pt1(){};
}
