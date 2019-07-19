#!/usr/bin/env bash
docker run --name oap -p 11800:11800 -p 12800:12800 --restart always -d apache/skywalking-oap-server
docker run --name oap-ui -p 8080:8080 --restart always -d -e SW_OAP_ADDRESS=192.168.24.22:12800 apache/skywalking-ui