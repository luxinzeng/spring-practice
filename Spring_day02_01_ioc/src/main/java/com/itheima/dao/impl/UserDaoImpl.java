package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.impl.UserServiceImpl;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository("userDao")
public class UserDaoImpl implements UserDao {

    public UserDaoImpl(){
        System.out.println("dao running....");
    }

    public void save() {
        System.out.println("user dao running...1");
    }
}
