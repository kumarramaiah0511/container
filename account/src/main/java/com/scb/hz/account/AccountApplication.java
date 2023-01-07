package com.scb.hz.account;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.scb.hz.account.entity.UserAccount;

@SpringBootApplication
@EnableCaching
public class AccountApplication {


	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}
}
