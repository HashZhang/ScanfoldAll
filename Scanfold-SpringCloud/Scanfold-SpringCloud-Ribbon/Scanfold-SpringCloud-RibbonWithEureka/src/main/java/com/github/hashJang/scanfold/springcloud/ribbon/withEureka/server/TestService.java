package com.github.hashJang.scanfold.springcloud.ribbon.withEureka.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestService {
    @RequestMapping("/test")
    public String testService() {
        return "" + System.currentTimeMillis();
    }
}
