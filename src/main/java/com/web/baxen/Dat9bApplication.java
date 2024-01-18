package com.web.baxen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
public class Dat9bApplication {

    public static void main(String[] args) {
        SpringApplication.run(Dat9bApplication.class, args);
    }


}


