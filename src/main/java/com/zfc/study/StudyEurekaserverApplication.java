package com.zfc.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class StudyEurekaserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyEurekaserverApplication.class, args);
    }

}
