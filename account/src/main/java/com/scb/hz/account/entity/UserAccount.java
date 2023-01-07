package com.scb.hz.account.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accountuser")
public class UserAccount implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	//@Column(name = "id")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//private Long id;

	//@Column(name = "accountNumber")
	private String accountid;

	//@Column(name = "name")
	private String holder;

	//@Column(name = "address")
	private String branch;

	//@Column(name = "balance")
	private long balance;

	public String getAccountid() {
		return accountid;
	}

	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public UserAccount(String accountid, String holder, String branch, long balance) {
		super();
		this.accountid = accountid;
		this.holder = holder;
		this.branch = branch;
		this.balance = balance;
	}

	public UserAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}