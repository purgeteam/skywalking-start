package com.purge.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author purgeyao
 * @since 1.0
 */
@RestController
public class OrderController {

    @GetMapping("order")
    public String order(){
        return "order";
    }
}
