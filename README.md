# spring-cloud-demo
一个基于 SpringCloud 搭建的微服务 Demo

## 组件说明

- 服务注册发现：Nacos
- 配置中心：Nacos
- 远程调用：OpenFeign
- 负载均衡：LoadBalancer
- 限流、熔断组件：Sentinel
- 网关组件：Spring Cloud Gateway
- 消息队列：RabbitMQ

## 目录说明

- unite-book 书服务
- book-store 书城后端

依赖路径：书城 -> 书服务

### provider

provider 用于封装所有 OpenFeign 的远端服务调用逻辑，以供其他依赖模块使用。

```java
// eg：book-provider 书服务调用封装
com.guanyu.provider.book        // 书服务根包
com.guanyu.provider.book.api    // API 包路径
com.guanyu.provider.book.core   // client 包路径
com.guanyu.provider.book.domain // 接口所需实体类

// 不建议将远端接口返回的实体直接暴露给依赖服务，需要使用 DTO 做一次转换再输出从而达到解耦的目的，这样即使对方接口修改依赖服务也不需要修改业务代码。

// 真正对外提供方法调用的类
com.guanyu.provider.book.BookProvider
```

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
