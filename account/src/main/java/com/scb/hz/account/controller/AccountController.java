package com.scb.hz.account.controller;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scb.hz.account.entity.UserAccount;
import com.scb.hz.account.service.AccountService;

@RestController
@RequestMapping(path = "account")
public class AccountController {
	
		@Autowired
		private AccountService accountservice;
		
		//@Autowired
		//private Map<String, UserAccount> accountMap;

		@GetMapping(path = { "/get/{accountNumber}" })
		public ResponseEntity<UserAccount> getAccount(@PathVariable("accountNumber") String accountNumber) {
			 return new ResponseEntity<>(accountservice.getAccount(accountNumber),HttpStatus.OK);
			 
		}
		
		@GetMapping(path = { "/holder/get/{holder}" })
		public ResponseEntity<List<UserAccount>> getAccountByCustomer(@PathVariable("holder") String holder) {
			 return new ResponseEntity<>(accountservice.getAccountsByCustomer(holder),HttpStatus.OK);
			 
		}

		@PostMapping("/new")
		public ResponseEntity<UserAccount> addAccount(@RequestBody UserAccount useraccount) {
			return new ResponseEntity<>(accountservice.addAccount(useraccount),HttpStatus.CREATED);
		}

		@PutMapping(path = { "/modify/{accountNumber}" })
		public ResponseEntity<UserAccount>  updateAccount(@RequestBody UserAccount useraccount){
			 return new ResponseEntity<>(accountservice.updateAccount(useraccount),HttpStatus.OK);
		}

	}


