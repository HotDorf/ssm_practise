package cn.itcast.service.impl;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service  /*为什么写到接口上运行报错*/
public class AccountServiceImpl implements AccountService{


    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户...");
        return null;
    }

    public void saveAccount(Account account) {
        System.out.println("业务层：保存帐户...");

    }
}
