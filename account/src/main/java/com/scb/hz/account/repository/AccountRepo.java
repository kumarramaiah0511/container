package com.scb.hz.account.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.scb.hz.account.entity.UserAccount;

public interface AccountRepo extends JpaRepository<UserAccount, String> {
       
	  @Query
	  public List<UserAccount> findByHolder(String holder);
	   
	}

