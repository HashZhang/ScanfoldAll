# Scanfold - ElasticSearch

# Scanfold - SpringCloud - ElasticSearch

# Scanfold - Spring - Data - ElasticSearch



ElasticSearch脚手架工程，在SpringCloud环境下还有spring-data-elasticsearch这个比较好用的客户端抽象。
在Spring-Boot环境下，默认已经在`<dependencyManagement>`下集成了ElasticSearch，如果想替换成自己想用的版本，需要在自己的项目重新建立`<dependencyManagement>`并将自己想用的版本集成进去
还有，ElasticSearch本身依赖于Netty，很容易与其他依赖有冲突。需要好好检查剔除不需要的依赖。而且，其他的依赖如果初始化了netty则ES客户端启动时会报错