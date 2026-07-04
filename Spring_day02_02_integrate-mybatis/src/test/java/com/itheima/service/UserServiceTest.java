package com.itheima.service;

import com.itheima.config.SpringConfig;
import com.itheima.domain.Account;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//设定Spring专用的类加载器
@ContextConfiguration(classes = SpringConfig.class)//设定加载的Spring上下文对应的配置
public class UserServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testFindById(){
        Account ac = accountService.findById(2);
//        System.out.println(ac);
        Assert.assertEquals("Jock",ac.getName());
    }

}
