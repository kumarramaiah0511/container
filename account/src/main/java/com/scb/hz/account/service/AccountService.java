package com.scb.hz.account.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.scb.hz.account.entity.UserAccount;
import com.scb.hz.account.repository.AccountRepo;

@Service
public class AccountService {
	
	@Autowired
	AccountRepo acctrepo;
	
	//@Autowired 
	//HazelcastInstance hazelcastinstance;
	
	

	public UserAccount getAccount(String acctid) {
		
	//	hazelcastinstance.getMap(name).
		System.out.println("In get Account.get account .talking to DB");
		System.out.println("============");
		Optional<UserAccount> ua= acctrepo.findById(acctid);
		return ua.get();
	}

	public List<UserAccount> getAccountsByCustomer(String holder) {
		System.out.println("In get Account By Customer for get..talking to DB");
		System.out.println("============");
		List<UserAccount> aclist= acctrepo.findByHolder(holder);
		return aclist;
	}
	

	public UserAccount addAccount(UserAccount ac) {
		acctrepo.save(ac);
		
		return ac;
	}

	public UserAccount updateAccount(UserAccount ac) {
		System.out.println("In update Acount..talking to DB");
		System.out.println("============");
		acctrepo.deleteById(ac.getAccountid());
		acctrepo.save(ac);
		return ac;
	}
}
