package com.github.hashJang.scanfold.springcloud.ribbon.withEureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TestServer {
    public static void main(String[] args) {
        SpringApplication.run(TestServer.class, args);
    }
}