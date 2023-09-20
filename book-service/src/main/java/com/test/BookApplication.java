package com.test;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableAutoDataSourceProxy
@EnableOAuth2Sso
public class BookApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class,args);
    }
}
