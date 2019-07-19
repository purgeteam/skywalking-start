package com.dubbo.client.demo.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author purgeyao
 * @since 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.dubbo.client.demo")
public class DubboSpringCloudClientBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(DubboSpringCloudClientBootstrap.class);
    }

}
