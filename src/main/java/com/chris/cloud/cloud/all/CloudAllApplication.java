package com.chris.cloud.cloud.all;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CloudAllApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudAllApplication.class, args);
    }
}
