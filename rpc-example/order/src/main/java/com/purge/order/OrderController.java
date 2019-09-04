package com.purge.order;

import java.io.FileNotFoundException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.util.ClassUtils;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author purgeyao
 * @since 1.0
 */
@RestController
public class OrderController {

    @GetMapping("order")
    public String order(HttpServletRequest request) throws FileNotFoundException {
        String property = System.getProperty("user.dir");
        String path1 = ClassUtils.getDefaultClassLoader().getResource("").getPath();

        String path2 = ResourceUtils.getURL("classpath:").getPath();
        String path = request.getServletContext().getRealPath("");
        return "order";
    }
}
