package com.preet.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Preet on 9/18/2016.
 */
@EnableAutoConfiguration
@SpringBootApplication
public class ApplicationConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationConfiguration.class, args);
    }
}
