#!/usr/bin/env bash
docker build -t user:latest .
docker run --name user \
    -v /Volumes/CodeFile/GitHub/purgeteam/skywalking-start/service/apache-skywalking-apm-bin/agent:/agent \
    -p 7001:7001 user:latest -d \
    --build-arg SW_AGENT_NAMESPACE=User