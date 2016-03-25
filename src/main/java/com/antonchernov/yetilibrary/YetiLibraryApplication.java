package com.antonchernov.yetilibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
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
