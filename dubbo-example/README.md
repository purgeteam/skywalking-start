# dubbo

### 结构介绍
```text
客户端
spring-cloud-alibaba-dubbo-client-sample

服务端
spring-cloud-dubbo-server-sample

公用接口
spring-cloud-dubbo-sample-api
```

### 测试调用

```text
访问 http://127.0.0.1:8081/echo/1

返回 [echo version = "1.0.0"] Hello, 1
```
```text
访问 http://127.0.0.1:8081/echo2/1

返回 [echo version = "2.0.0"] Hello, 1
```


### DubboSpringCloudClient op 参数
```text
-javaagent:/Volumes/CodeFile/GitHub/purgeteam/skywalking-start/service/apache-skywalking-apm-bin/agent/skywalking-agent.jar 
-Dskywalking.agent.service_name=DubboSpringCloudClient
-Dskywalking.collector.backend_service=localhost:11800
```

### DubboSpringCloudServer op 参数
```text
-javaagent:/Volumes/CodeFile/GitHub/purgeteam/skywalking-start/service/apache-skywalking-apm-bin/agent/skywalking-agent.jar 
-Dskywalking.agent.service_name=DubboSpringCloudServer
-Dskywalking.collector.backend_service=localhost:11800
```
