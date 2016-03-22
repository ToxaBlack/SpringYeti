package com.antonchernov.yetilibrary;

import com.antonchernov.yetilibrary.configuration.ApplicationSecurity;
import com.antonchernov.yetilibrary.rest.model.Account;
import com.antonchernov.yetilibrary.rest.repository.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class YetilibraryApplication {
	@Bean
	public WebSecurityConfigurerAdapter webSecurityConfigurerAdapter() {
		return new ApplicationSecurity();
	}



	public static void main(String[] args) {
		SpringApplication.run(YetilibraryApplication.class, args);
	}
}
