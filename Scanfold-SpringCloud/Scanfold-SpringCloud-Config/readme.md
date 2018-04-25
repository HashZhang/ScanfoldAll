# Spring Cloud Config
是基于Git文件的配置中心

## 配置Server
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
编写application.properties：

## 配置Client