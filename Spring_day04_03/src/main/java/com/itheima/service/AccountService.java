package com.itheima.service;

import com.itheima.domain.Account;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AccountService {

    /**
     * 转账操作
     * @param outName     出账用户名
     * @param inName      入账用户名
     * @param money       转账金额
     */
    @Transactional(
            readOnly = false,
            timeout = -1
    )//注解，在此处编写事务传播行为，还有事务需要写在接口类中
    public void transfer(String outName, String inName, Double money);

}
