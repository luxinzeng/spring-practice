package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountService {
    void save (Account account);

    void delect(Integer id);

    void update(Account account);

    List<Account> findAll();

    Account FindById(Integer id);
}
