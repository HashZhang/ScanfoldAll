package com.github.hashJang.scanfold.springcloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableScheduling
@RestController
public class Main {
    @Value("${testA}")
    private String test;

    @RequestMapping("/test")
    public String test() {
        return test;
    }

    @Scheduled(fixedDelay = 1000)
    public void print() {
        System.out.println("testA:" + test);
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
