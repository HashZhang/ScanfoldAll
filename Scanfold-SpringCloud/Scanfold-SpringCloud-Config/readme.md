# Spring Cloud Config
是基于Git文件的配置中心

## 基本配置

### 配置本地config目录 
在本地home新建目录config，添加一个properties文件，内容里面写上一个配置，例如：
test.properties:
```
testA=test2
```

### 配置Server

参考：https://github.com/HashZhang/ScanfoldAll/tree/master/Scanfold-SpringCloud/Scanfold-SpringCloud-Config/Scanfold-SpringCloud-Config-Server

除了Springcloud基本配置，maven配置：
```
<dependencies>
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-config-server</artifactId>
    </dependency>
</dependencies>
```
编写application.properties：
```
server.port: 8888
#${user.home}代表用户home目录，对于windows，如果配置为本地文件夹，则需要以file:///开头，linux以file://开头
spring.cloud.config.server.git.uri: file:///${user.home}/config
```
编写主类：
```
@SpringBootApplication
@EnableConfigServer
public class ConfigServer {
  public static void main(String[] args) {
    SpringApplication.run(ConfigServer.class, args);
  }
}
```

### 配置Client

除了Springcloud基本配置，maven配置：
```
<dependencies>
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-config</artifactId>
    </dependency>
</dependencies>
```

编写application.properties:
```
spring.application.name=Scanfold-SpringCloud-Config-Client
#Config Server的地址
spring.cloud.config.uri: http://localhost:8888
```
编写主类：
```
@SpringBootApplication
@Service
@EnableScheduling
public class Main {
    @Value("${testA}")
    private String test;

    @Scheduled(fixedDelay = 1000)
    public void print() {
        System.out.println("testA:" + test);
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
```

启动后，可以看到testA这个配置被加载进来了，值为test2

访问

## Config Server profile文件命名规则

```
/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties
```
