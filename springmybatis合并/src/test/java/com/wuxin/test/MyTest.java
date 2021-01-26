package com.wuxin.test;

import com.wuxin.pojo.Accounts;
import com.wuxin.pojo.Users;
import com.wuxin.service.AccountsService;
import com.wuxin.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 孙豪文
 * 2020/12/10
 */
public class MyTest {
    ApplicationContext ac;
    @Before
    public void myBefore(){
        ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
    }

    @Test
    public void myTest(){
        Users users = new Users(100,"zar","123");
        UserService bean = ac.getBean(UserService.class);
        int i = bean.addUsers(users);
        System.out.println(i);
    }

    @Test
    public void myTest2(){
        Accounts accounts = new Accounts(100,"zar","123");
        AccountsService bean = ac.getBean(AccountsService.class);
        int i = bean.addAccounts(accounts);
        System.out.println(i);
    }
}
