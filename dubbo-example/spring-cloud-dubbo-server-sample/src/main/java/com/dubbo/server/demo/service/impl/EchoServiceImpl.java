package com.dubbo.server.demo.service.impl;

import com.dubbo.api.demo.service.EchoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author purgeyao
 * @since 1.0
 */
@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {

    @Override
    public String echo(String message) {
        return "[echo version = \"1.0.0\"] Hello, " + message;
    }

}
