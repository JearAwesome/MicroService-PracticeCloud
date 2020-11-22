package org.cloudpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AccountApp {
    public static void main(String[] args) {
        SpringApplication.run(AccountApp.class,args);
    }
}
