package com.dubbo.client.demo.controller;

import com.dubbo.api.demo.service.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author purgeyao
 * @since 1.0
 */
@RestController
public class TestController {

    @Reference(version = "1.0.0")
    private EchoService echoService;

    @Reference(version = "2.0.0")
    private EchoService echoService2;

    /**
     * EchoService 1.0.0 版本调用
     *
     * @param message message
     * @return string
     */
    @GetMapping("/echo/{message}")
    public String echo(@PathVariable String message) {
        return echoService.echo(message);
    }

    /**
     * EchoService 2.0.0 版本调用
     *
     * @param message message
     * @return string
     */
    @GetMapping("/echo2/{message}")
    public String echo2(@PathVariable String message) {
        return echoService2.echo(message);
    }

}
