FROM hub.c.163.com/library/java:8-alpine

MAINTAINER noly 1346735074@qq.com

ENV SW_LOGGING_FILE_NAME="user-api.log"

ADD target/*.jar user.jar

#VOLUME ["/Volumes/CodeFile/GitHub/purgeteam/skywalking-start/service/apache-skywalking-apm-bin/agent","/agent"]

EXPOSE 7001

ENTRYPOINT ["java", "-jar", "-javaagent:/agent/skywalking-agent.jar", "/user.jar"]
#ENTRYPOINT ["java", "-jar", "/user.jar"]