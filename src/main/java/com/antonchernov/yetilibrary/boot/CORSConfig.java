package com.antonchernov.yetilibrary.boot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by anton.charnou on 21.03.2016.
 */
@Configuration
@Slf4j
public class CORSConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                log.debug("add Cros");
                registry.addMapping("/**").allowedOrigins("http://localhost:3000")
                        .allowedMethods("PUT", "DELETE", "POST", "GET").maxAge(3600);
            }
        };
    }
}
