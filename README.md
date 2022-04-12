# spring-cloud-demo
一个基于 SpringCloud 搭建的微服务 Demo

## 组件说明

- 服务注册发现：Nacos
- 配置中心：Nacos
- 远程调用：OpenFeign
- 负载均衡：LoadBalancer
- 限流、熔断组件：Sentinel
- 网关组件：Spring Cloud Gateway

## 服务启动

> 安装包自行在官方下载使用

### 默认 8848 端口，启动 Nacos 服务

```shell
startup.cmd -m standalone
```

### 默认 8080 端口，启动 Sentinel 控制台

```shell
java -jar sentinel-dashboard.jar
```
