package com.vismee.springaop;

import com.vismee.springaop.account.AccountImpl;
import com.vismee.springaop.dao.AccountDao;
import com.vismee.springaop.dao.MembershipDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringaopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringaopApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDao accountDao, MembershipDao membershipDao)
	{
		return runner ->
		{
			createAccount(accountDao,membershipDao);
		};
	}

	private void createAccount(AccountDao accountDao, MembershipDao membershipDao)
	{
		AccountImpl account = new AccountImpl();
		accountDao.addAccount(account,true);
		accountDao.accountDetails();
		accountDao.setName("Sooriya Meenakshi");
		accountDao.getName();
		accountDao.setAccountType("Salary Account");
		accountDao.getAccountType();
		membershipDao.addMembershipAccount();
		membershipDao.isAccountValid();
	}

}
