package con.purge.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author purgeyao
 * @since 1.0
 */
@EnableFeignClients
@SpringBootApplication
public class UserBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(UserBootstrap.class, args);
    }

}
