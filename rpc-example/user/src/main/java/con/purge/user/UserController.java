package con.purge.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author purgeyao
 * @since 1.0
 */
@RestController
public class UserController {

    @Resource
    OrderApi orderApi;

    @GetMapping("user")
    public String user(){
        return orderApi.order();
    }
}
