package com.github.hashJang.scanfold.springcloud.eureka.service.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class TestService {
    @RequestMapping("/test")
    public String test() {
//        throw new IllegalArgumentException();
        return "test";
    }
    public static void main(String[] args) {
        SpringApplication.run(TestService.class, args);
    }
}
