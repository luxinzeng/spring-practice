package com.itheima;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.config.SpringConfig;
import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //创建一个Spring容器，从类路径下加载，把里面所有的Bean都创建好，放到容器里。
        //XML方式
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-back.xml");

        //注解开发方式
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        UserService userService = (UserService) ctx.getBean("userService");
        userService.save();

//        UserDao userDao = (UserDao) ctx.getBean("userDao");
//        userDao.save();
//
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        bookDao.save();

        DruidDataSource dataSource = (DruidDataSource)ctx.getBean("dataSource");
        System.out.println(dataSource);
    }
}
