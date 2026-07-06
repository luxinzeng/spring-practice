package com.itheima.service.impl;

import com.itheima.service.UserService;

public class UserServiceImpl implements UserService {

    public void save(int i){

        System.out.println("user service running"+ i);
//        int i=1/0;
    }

    @Override
    public int update() {
        System.out.println("update run");
        return 100;
    }

}
