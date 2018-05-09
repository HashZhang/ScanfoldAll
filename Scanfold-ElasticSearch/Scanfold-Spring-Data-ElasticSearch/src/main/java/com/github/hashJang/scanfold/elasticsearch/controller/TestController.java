package com.github.hashJang.scanfold.elasticsearch.controller;

import com.github.hashJang.scanfold.elasticsearch.domain.TestDomainObject;
import com.github.hashJang.scanfold.elasticsearch.repository.TestCurdRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@RestController
public class TestController {
    @Autowired
    private TestCurdRepository testCurdRepository;

    @RequestMapping("/testGetAll")
    public Object testGetAll() {
        return testCurdRepository.findAll();
    }

    @RequestMapping("/testSaveOne")
    public Object testSaveOne() {
        TestDomainObject testDomainObject = new TestDomainObject();
        testDomainObject.setId("dcefa2e2-f1f4-4c59-8185-f6857d2ae497");
        testDomainObject.setName("zhx's blog");
        testDomainObject.setBody("this is yours, zhx's apple, adam");
        testDomainObject.setCreateTime(new Timestamp(118, 5, 1, 8, 0, 0, 0));
        testDomainObject.setAccountBalance(2004500.31);
        testDomainObject.setScore(93L);
        return testCurdRepository.save(testDomainObject);
    }

    @RequestMapping("/testSaveMany")
    public Object testSaveMany() {
        List<TestDomainObject> testDomainObjects = Lists.newArrayList();

        TestDomainObject testDomainObject = new TestDomainObject();
        testDomainObject.setId("dcefa2e2-f1f4-4c59-8185-f6857d2ae497");
        testDomainObject.setName("zhx's blog");
        testDomainObject.setBody("this is yours, zhx's apple, adam");
        testDomainObject.setCreateTime(new Timestamp(118, 5, 1, 8, 0, 0, 0));
        testDomainObject.setAccountBalance(2004500.31);
        testDomainObject.setScore(93L);
        testDomainObjects.add(testDomainObject);

        testDomainObject = new TestDomainObject();
        testDomainObject.setId("dcefa2e2-f1f4-4c59-8185-f6857d2ae498");
        testDomainObject.setName("zhx's diary");
        testDomainObject.setBody("A call from Beijing. Between Shenzhen and Beijing");
        testDomainObject.setCreateTime(new Timestamp(118, 5, 4, 8, 0, 0, 0));
        testDomainObject.setAccountBalance(1504500.31);
        testDomainObject.setScore(85L);
        testDomainObjects.add(testDomainObject);

        testDomainObject = new TestDomainObject();
        testDomainObject.setId("dcefa2e2-f1f4-4c59-8185-f6857d2ae499");
        testDomainObject.setName("gq's call");
        testDomainObject.setBody("I go to Shenzhen while he goes to Beijing");
        testDomainObject.setCreateTime(new Timestamp(118, 5, 4, 8, 0, 0, 0));
        testDomainObject.setAccountBalance(1504500.31);
        testDomainObject.setScore(85L);
        testDomainObjects.add(testDomainObject);

        testDomainObject = new TestDomainObject();
        testDomainObject.setId("dcefa2e2-f1f4-4c59-8185-f6857d2ae500");
        testDomainObject.setName("czj's hurt, I get it now from the news about dys. A so called better man occurred, and I did not play my part well. Then she treat me like that. Go to hell and fuck you! ");
        testDomainObject.setBody("go to hell, bitch and dog, last forever");
        testDomainObject.setCreateTime(new Timestamp(118, 4, 2, 0, 0, 0,0));
        testDomainObject.setAccountBalance(65411.20);
        testDomainObject.setScore(79L);
        testDomainObjects.add(testDomainObject);

        testDomainObject = new TestDomainObject();
        testDomainObject.setId("dcefa2e2-f1f4-4c59-8185-f6857d2ae501");
        testDomainObject.setName("gwj met at client");
        testDomainObject.setBody("gwj is from ningxia, that is not perfect. But she's a good loking, well maybe...");
        testDomainObject.setCreateTime(new Timestamp(118, 3, 23, 0, 0, 0, 0));
        testDomainObject.setAccountBalance(730000.00);
        testDomainObject.setScore(88L);
        testDomainObjects.add(testDomainObject);

        testDomainObject = new TestDomainObject();
        testDomainObject.setId("dcefa2e2-f1f4-4c59-8185-f6857d2ae502");
        testDomainObject.setName("");

        return testCurdRepository.save(testDomainObject);
    }

}
