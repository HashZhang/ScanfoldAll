package com.github.hashJang.scanfold.elasticsearch.repository;

import com.github.hashJang.scanfold.elasticsearch.domain.TestDomainObject;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TestCurdRepository extends PagingAndSortingRepository<TestDomainObject, String> {
}
