# Spring-Cloud脚手架工程

> 根据官网(http://projects.spring.io/spring-cloud/)最新版本更新

## 配置中心

配置中心一般采用Spring-Cloud-Config，Disconf或者Apollo。

Spring-Cloud-Config:原生，架构最简单，基于git存储，能看到config变化历史。但是，默认不支持热修改，修改之后必须重启。想支持热修改，需要添加额外依赖
 
![](https://github.com/HashZhang/ScanfoldAll/blob/master/doc/spring/spring-cloud/spring-cloud-config.jpg)

## 之前版本存在的坑以及解决：


