# SpringCloud-Dalston-Demo
Dalston版本-Demo


### 各模块介绍


模块名称 | 端口 | 简介
---|---|---
eureka-registry-server | 1001 | 服务注册中心，提供服务注册、发现功能
eureka-client | 2001 | 服务提供方demo
eureka-consumer | 2101 | 服务消费方demo
eureka-consumer-ribbon | 2101 | 服务消费方ribbon-demo
eureka-consumer-feign | 2101 | 服务消费工具Feign-demo
eureka-consumer-feign-upload |  | 使用Feign调用服务提供方上传接口
config-server-git | 1201 | 配置中心 服务端  调用Git中的配置
config-client | 2001 |  读取配置中心配置
eureka-consumer-ribbon-hystrix |  | ribbon使用hystrix进行服务熔断
eureka-consumer-feign-hystrix |  |  feign使用hystrix进行服务熔断



### 案例开发教程

- [Dalston-服务注册与发现+服务提供-Eureka-1](http://wjwcloud.com/springcloud/2019/03/21/Dalston-服务注册与发现+服务提供-Eureka-1/)
- [Dalston-服务消费-2](http://wjwcloud.com/springcloud/2019/03/21/Dalston-服务消费-2/)
- [Dalston-负载均衡工具包-Ribbon-3](http://wjwcloud.com/springcloud/2019/03/21/Dalston-负载均衡工具包-Ribbon-3/)
- [Dalston-服务消费工具-Feign-4](http://wjwcloud.com/springcloud/2019/03/21/Dalston-服务消费工具-Feign-4/)
- [Dalston-服务消费工具-Feign-上传文件-5](http://wjwcloud.com/springcloud/2019/03/21/Dalston-服务消费工具-Feign-上传文件-5/)
- [Dalston-分布式配置中心-(Config)-6](http://wjwcloud.com/springcloud/2019/03/21/Dalston-分布式配置中心-(Config)-6/)
