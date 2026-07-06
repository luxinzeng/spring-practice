package com.itheima.service.impl;

import com.itheima.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    public int save(int i){

        System.out.println("user service running"+ i);
        return 100;
    }


}
