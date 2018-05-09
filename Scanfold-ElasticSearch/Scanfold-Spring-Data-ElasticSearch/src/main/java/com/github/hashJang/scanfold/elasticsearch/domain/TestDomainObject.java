package com.github.hashJang.scanfold.elasticsearch.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.sql.Timestamp;

@Data
@Document(indexName = "testdomainobject")
public class TestDomainObject {
    @Id
    private String id;
    private String name;
    private Long score;
    private Double accountBalance;
    private Timestamp createTime;
    private String body;
}
