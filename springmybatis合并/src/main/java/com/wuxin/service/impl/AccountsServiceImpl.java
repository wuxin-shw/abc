package com.wuxin.service.impl;

import com.wuxin.mapper.AccountsMapper;
import com.wuxin.pojo.Accounts;
import com.wuxin.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 孙豪文
 * 2020/12/11
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,noRollbackFor = ArithmeticException.class)
public class AccountsServiceImpl implements AccountsService {
    @Autowired
    AccountsMapper accountsMapper;
    @Override
    public int addAccounts(Accounts accounts) {
        int i = accountsMapper.addAccounts(accounts);
        int a = i/0;
        return a;
    }
}
