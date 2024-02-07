package com.vismee.springaop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDaoImpl implements MembershipDao
{
    @Override
    public boolean addMembershipAccount() {
        System.out.println(getClass() + " Inside addAccount - adding membership details into db");
        return true;
    }

    @Override
    public boolean isAccountValid() {
        System.out.println(getClass() + " Testing account validity");
        return false;
    }
}
