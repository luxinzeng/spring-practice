package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.UserDao;
import com.itheima.service.UserService;

public class UserServiceImpl implements UserService {
    private BookDao bookDao;
    private int num;

    public UserServiceImpl() {
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void setNum(int num) {
        this.num = num;
    }

    private UserDao userDao;
    //1对于需要添加注入的变量添加set方法
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("UserSeervice  实行d");
        userDao.save();
        System.out.println(num);
        bookDao.save();
    }
}
