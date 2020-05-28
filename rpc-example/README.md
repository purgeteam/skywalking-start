# rpc-example

### 结构介绍
```text
客户端
user

服务端
order
```

### 测试调用
```text
启动order服务
启动user服务

访问http://127.0.0.1:7001/user  链路为：user->order 返回 order
```


### user op 参数
```text
-javaagent:/Volumes/CodeFile/GitHub/purgeteam/skywalking-start/service/apache-skywalking-apm-bin/agent/skywalking-agent.jar -Dskywalking.agent.service_name=UserService

-javaagent:/Volumes/CodeFile/GitHub/purgeteam/skywalking-start/service/apache-skywalking-apm/7.0.0.es7/apache-skywalking-apm-bin-es7/agent/skywalking-agent.jar -Dskywalking.agent.service_name=UserService
```

### user op 参数
```text
-javaagent:/Volumes/CodeFile/GitHub/purgeteam/skywalking-start/service/apache-skywalking-apm-bin/agent/skywalking-agent.jar -Dskywalking.agent.service_name=OrderService

-javaagent:/Volumes/CodeFile/GitHub/purgeteam/skywalking-start/service/apache-skywalking-apm/7.0.0.es7/apache-skywalking-apm-bin-es7/agent/skywalking-agent.jar -Dskywalking.agent.service_name=OrderService
```
