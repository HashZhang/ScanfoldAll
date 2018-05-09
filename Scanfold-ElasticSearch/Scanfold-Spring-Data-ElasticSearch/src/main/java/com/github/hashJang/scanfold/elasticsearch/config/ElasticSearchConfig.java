package com.github.hashJang.scanfold.elasticsearch.config;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.elasticsearch.xpack.client.PreBuiltXPackTransportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.github.hashJang.scanfold.elasticsearch.repository")
public class ElasticSearchConfig {
//    @Bean
//    public ElasticsearchOperations getElasticTemplate() throws UnknownHostException {
//        TransportClient transportClient = new PreBuiltTransportClient(Settings.builder()
//                .put("cluster.name", "sportybet-test-es")
//                .build());
//        transportClient.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("172.31.64.155"), 9300));
//        return new ElasticsearchTemplate(transportClient);
//    }

    /**
     * x-pack加密的客户端配置
     * @return x-pack加密的客户端
     */
    @Bean(name = "elasticsearchTemplate")
    public ElasticsearchTemplate getElasticTemplate() throws UnknownHostException {
        TransportClient transportClient = new PreBuiltXPackTransportClient(Settings.builder()
                .put("cluster.name", "sportybet-test-es")
                .put("xpack.security.user", "elastic:tY9e8dY8nSmGJSi51oYa")
                .build());
        transportClient.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("172.31.64.194"), 9300));
        return new ElasticsearchTemplate(transportClient);
    }
}
