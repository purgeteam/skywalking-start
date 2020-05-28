# skywalking-start

[![Build Status](https://secure.travis-ci.org/elasticjob/elastic-job-lite.png?branch=master)](https://travis-ci.org/elasticjob/elastic-job-lite)
[![Maven Status](https://maven-badges.herokuapp.com/maven-central/com.dangdang/elastic-job-lite/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.dangdang/elastic-job-lite)
[![Gitter](https://badges.gitter.im/Elastic-JOB/elastic-job-lite.svg)](https://gitter.im/Elastic-JOB/elasticjob?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)
[![Coverage Status](https://coveralls.io/repos/elasticjob/elastic-job/badge.svg?branch=master&service=github)](https://coveralls.io/github/elasticjob/elastic-job?branch=master)
[![GitHub release](https://img.shields.io/github/release/elasticjob/elastic-job.svg)](https://github.com/elasticjob/elastic-job/releases)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)

## 参考
- https://hub.docker.com/r/apache/skywalking-oap-server
- https://hub.docker.com/r/apache/skywalking-ui
- https://github.com/apache/skywalking-kubernetes
- https://github.com/apache/skywalking-docker

设置java代理
- https://github.com/apache/skywalking/blob/master/docs/en/setup/service-agent/java-agent/README.md

按系统属性查找代理配置文件
- https://github.com/apache/skywalking/blob/master/docs/en/setup/service-agent/java-agent/Specified-agent-config.md

设置覆盖
- https://github.com/apache/skywalking/blob/master/docs/en/setup/service-agent/java-agent/Setting-override.md


### 后端存储
[后端存储](https://github.com/apache/skywalking/blob/master/docs/en/setup/backend/backend-storage.md)

### oap集群配置
[oap集群配置](https://github.com/apache/skywalking/blob/master/docs/en/setup/backend/backend-cluster.md)




## 例子

### 创建skywalking容器
```text
cd service/docker-start
sh skywalking.sh
```

### docker-compose方式创建
```text
cd service/docker-start
docker-compose -f docker-compose.yml up -d
```

### 控制台访问

```text
使用http://127.0.0.1:8080/ 进行访问了
```


```text
wget http://mirror.bit.edu.cn/apache/skywalking/6.2.0/apache-skywalking-apm-6.2.0.tar.gz

tar -zxvf apache-skywalking-apm-6.2.0.tar.gz  -C /root/


cp -r apache-skywalking-apm-bin/agent/. skywalking_agent/
```