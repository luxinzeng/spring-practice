package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

import java.util.*;

public class BookDaoImpl implements BookDao {
    private List al;
    private Properties properties;
    private int[] arr;
    private Set hs;
    private Map hm;

    public void setAl(List al) {
        this.al = al;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void setHs(Set hs) {
        this.hs = hs;
    }

    public void setHm(Map hm) {
        this.hm = hm;
    }

    @Override
    public void save() {
        System.out.println("book run");
        System.out.println("ArrayList:"+al);
        System.out.println("properties:"+properties);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("HashSet:"+hs);
        System.out.println("HashMap:"+hm);

    }
}
