package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository//三
@Primary//赋予优先级
@PropertySource("classpath:jdbc.properties")//此处不支持通配格式*，
//@PropertySource({"classpath:jdbc.properties","classpath:jdbc.properties"})
//多个可以采取以上数组形式
//XML方式使用<context:property-placeholder>
//注解方式使用@PropertySource
public class BookDaoImpl implements BookDao {

    @Value("${jdbc.userName}")
    private String userName;
    @Value("${jdbc.password}")
    private String password;


    public void save() {
        System.out.println("book dao running...1 "+userName+"-"+password);
    }
}
