package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Service("userService")
@Scope("prototype")
public class UserServiceImpl implements UserService {


    @Override
    public void save() {
        System.out.println("userService run");

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
