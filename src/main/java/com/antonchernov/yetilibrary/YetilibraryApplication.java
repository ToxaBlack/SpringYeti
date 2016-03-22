package com.antonchernov.yetilibrary;

import com.antonchernov.yetilibrary.model.Account;
import com.antonchernov.yetilibrary.repository.AccountRepository;
import com.antonchernov.yetilibrary.security.JwtFilter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"com.antonchernov.yetilibrary"})
public class YetilibraryApplication {

	@Bean
	public FilterRegistrationBean jwtFilter() {
		final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter(new JwtFilter());
		registrationBean.addUrlPatterns("/api/*");

		return registrationBean;
	}

	@Bean
	CommandLineRunner init(final AccountRepository accountRepository) {

		return arg0 -> accountRepository.save(new Account("user", "password"));

	}

	public static void main(String[] args) {
		SpringApplication.run(YetilibraryApplication.class, args);
	}
}
