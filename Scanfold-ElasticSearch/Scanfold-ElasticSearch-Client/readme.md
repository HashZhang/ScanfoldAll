# Scanfold-ElasticSearch-Client

分为普通Client和RestClient

ES计划在7.0版本以后不再启用TransportClient，只通过RestClient访问

## TransportClient

 - client.transport.sniff： 如果为true，将启用自动发现新节点和排除过期节点。
 - client.transport.ignore_cluster_name：如果为true，将集群名称。
 - client.transport.ping_timeout：ping响应最大时间，默认5s
 - client.transport.nodes_sampler_interval：多久ping一次，默认5s

 