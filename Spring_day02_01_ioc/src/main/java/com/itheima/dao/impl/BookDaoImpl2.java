package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository//三
public class BookDaoImpl2 implements BookDao {


    public void save() {
        System.out.println("book dao running...2 ");
    }
}
