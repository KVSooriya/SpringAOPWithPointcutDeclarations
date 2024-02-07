package com.vismee.springaop.dao;

import com.vismee.springaop.account.Account;

public interface AccountDao
{
    void addAccount(Account account,boolean vip);
    void accountDetails();
    void setName(String name);
    String getName();
    void setAccountType(String accountType);
    String getAccountType();
}
