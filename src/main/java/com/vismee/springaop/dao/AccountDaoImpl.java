package com.vismee.springaop.dao;

import com.vismee.springaop.account.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao
{
    private String name;
    private String accountType;

    @Override
    public String getName() {
        System.out.println(getClass() + " Inside getName()");
        return name;
    }

    @Override
    public void setName(String name) {
        System.out.println(getClass() + " Inside setName()");
        this.name = name;
    }

    @Override
    public String getAccountType() {
        System.out.println(getClass() + " Inside getAccountType()");
        return accountType;
    }

    @Override
    public void setAccountType(String accountType) {
        System.out.println(getClass() + " Inside setAccountType()");
        this.accountType = accountType;
    }

    @Override
    public void addAccount(Account account,boolean vip) {
        System.out.println(getClass() + " Inside addAccount - adding details into db");
    }

    @Override
    public void accountDetails() {
        System.out.println(getClass() + " : Account details");
    }
}
