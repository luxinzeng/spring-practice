package com.itheima.dao;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountDao {
    void save (Account account);

    void delect(Integer id);

    void update(Account account);

    List<Account> findAll();

    Account FindById(Integer id);
}
