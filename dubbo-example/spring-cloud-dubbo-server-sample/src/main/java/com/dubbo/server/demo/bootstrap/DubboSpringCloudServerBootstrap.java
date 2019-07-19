package com.dubbo.server.demo.bootstrap;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @author purgeyao
 * @since 1.0
 */
@Slf4j
@EnableDiscoveryClient
@EnableAutoConfiguration
public class DubboSpringCloudServerBootstrap {

    public static void main(String[] args) {
        System.setProperty("skywalking.agent.service_name", "DubboSpringCloudServer");
//        System.setProperty("skywalking.collector.backend_service", "localhost:11800");

        ApplicationContext context = SpringApplication.run(DubboSpringCloudServerBootstrap.class);
        Environment environment = context.getEnvironment();

        String getenv = System.getenv("skywalking.agent.service_name");
        String property = System.getProperty("skywalking.agent.service_name");
        log.info("test");
    }

}
