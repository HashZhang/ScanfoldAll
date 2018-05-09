# Scanfold-SpringCloud-Eureka-Server

启动一个EurekaServer，注意在Spring Finchley之前的所有版本，依赖是：

```
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-eureka-server</artifactId>
</dependency>
```

从Spring Fincheley（包含Fincheley）之后，增加了netflix这个短语（官网文档并没有更新，汗）：

```
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
</dependency>
```