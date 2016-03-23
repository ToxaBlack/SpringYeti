package com.antonchernov.yetilibrary;

import com.antonchernov.yetilibrary.configuration.ApplicationSecurity;
import com.antonchernov.yetilibrary.rest.model.Book;
import com.antonchernov.yetilibrary.rest.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import java.util.Arrays;
import java.util.Collections;

@SpringBootApplication
public class YetiLibraryApplication {


    public static void main(String[] args) {
        SpringApplication.run(YetiLibraryApplication.class, args);
    }

    /** @Autowired BookRepository bookRepository;

     @Override public void run(String... strings) throws Exception {
     Arrays.asList(new Book("author", "title"), new Book("author", "title")).forEach(bookRepository::insert);
     }
     **/
}
