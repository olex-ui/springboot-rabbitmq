package com.example.springbootrabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootRabbitmqApplication {

    public static void main(String[] args) {
        System.out.println("master主干第一次添加");
        System.out.println("dev 分支");
        SpringApplication.run(SpringbootRabbitmqApplication.class, args);
    }

}
