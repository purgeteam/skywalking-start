package con.purge.user;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author purgeyao
 * @version 1.0
 */
@FeignClient(value = "order", url = "http://127.0.0.1:7000/")
public interface OrderApi {

    @GetMapping(value = "order")
    String order();

}
