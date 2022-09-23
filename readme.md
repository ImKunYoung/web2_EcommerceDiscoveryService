```yaml
server:
  port: 8761

spring:
  application:
    name: discovery-server

eureka:
  client:
    fetch-registry: false
    register-with-eureka: false
```


|키워드| 내용                      |
|:---|:------------------------|
|port: 8761| 포트번호 지정                 |
|register-with-eureka: false| 서비스 디스커버리는 유레카에 등록하지 않음 |
|fetch-registry: false||

