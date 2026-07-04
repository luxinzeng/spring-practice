package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Service("userService")//一
@DependsOn("userDao1")//依赖于的用法
@Scope("prototype")
public class UserServiceImpl implements UserService {

    @Value("3")//@Value:非引用类型的注入
    private int num;
    @Value("itheima")
    private String version;

    @Autowired//@Autowired：引用类型的注入
    @Qualifier("userDao2")
    private UserDao userDao;//类型相同自动根据变量名识别

    @Autowired
    private BookDao bookDao;

//    public void setNum(int num) {
//        this.num = num;
//    }
//
//    public void setVersion(String version) {
//        this.version = version;
//    }

    @Override
    public void save() {
        System.out.println("userService run"+ num +"-"+version);
        userDao.save();
        bookDao.save();

    }

    @PostConstruct
    public void init(){
        System.out.println("userService init");
    }

    @PreDestroy
    public void destory(){
        System.out.println("userService destory");
    }
}
