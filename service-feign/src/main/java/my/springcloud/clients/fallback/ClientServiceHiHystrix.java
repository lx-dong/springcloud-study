package my.springcloud.clients.fallback;

import my.springcloud.clients.ClientServiceHi;
import org.springframework.stereotype.Component;

/**
 * Created by lx-dong on 2018/10/15.
 */
@Component
public class ClientServiceHiHystrix implements ClientServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
