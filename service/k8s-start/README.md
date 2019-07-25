### Apache SkyWalking OAP服务器Docker文件

产考文章
- 我们可以设置环境变量来配置这个图像。其中大多数都是在后端设置中定义的，但Apache SkyWalking Docker Image添加了额外的环境变量来帮助用户正确地编写它。详细信息位于docker-entrypoint.sh中
- https://github.com/apache/skywalking-docker/tree/master/6/6.2/oap

- 后端存储
- https://github.com/apache/skywalking/blob/master/docs/en/setup/backend/backend-storage.md

- 集群管理
- https://github.com/apache/skywalking/blob/master/docs/en/setup/backend/backend-cluster.md

- 动态配置
- https://github.com/apache/skywalking/blob/master/docs/en/setup/backend/dynamic-config.md

- TTL
- https://github.com/apache/skywalking/blob/master/docs/en/setup/backend/ttl.md