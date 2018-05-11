package com.github.hashJang.scanfold.springcloud.ribbon.defaults;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DefaultService {
    @Autowired
    private RestTemplate restTemplate;

    @Scheduled(fixedDelay = 1000)
    public void testDefaultRibbon() {
        String forObject = restTemplate.getForObject("http://default-test/", String.class);

        System.out.println("**********************");
        System.out.println(forObject);
    }
}
