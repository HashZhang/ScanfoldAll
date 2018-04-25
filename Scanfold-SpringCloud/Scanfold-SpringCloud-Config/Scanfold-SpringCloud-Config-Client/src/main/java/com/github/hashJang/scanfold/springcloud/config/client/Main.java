package com.github.hashJang.scanfold.springcloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@SpringBootApplication
@Service
@EnableScheduling
public class Main {
    @Value("${testA}")
    private String test;

    @Scheduled(fixedDelay = 1000)
    public void print() {
        System.out.println("testA:" + test);
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
