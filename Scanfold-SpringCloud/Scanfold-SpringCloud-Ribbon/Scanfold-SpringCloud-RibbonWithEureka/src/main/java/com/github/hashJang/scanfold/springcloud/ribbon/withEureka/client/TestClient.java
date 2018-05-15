package com.github.hashJang.scanfold.springcloud.ribbon.withEureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TestClient {
    public static void main(String[] args) {
        SpringApplication.run(TestClient.class, args);
    }
}
