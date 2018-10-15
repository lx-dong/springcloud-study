package my.springcloud.clients;

import my.springcloud.clients.fallback.ClientServiceHiHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by lx-dong on 2018/10/15.
 */
@FeignClient(value = "service-hi", fallback = ClientServiceHiHystrix.class)
public interface ClientServiceHi {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam("name") String name);
}
