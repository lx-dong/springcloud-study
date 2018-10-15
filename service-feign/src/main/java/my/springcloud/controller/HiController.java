package my.springcloud.controller;

import my.springcloud.clients.ClientServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lx-dong on 2018/10/15.
 */
@RestController
public class HiController {

    @Autowired
    ClientServiceHi clientServiceHi;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String name) {
        return clientServiceHi.sayHiFromClientOne(name);
    }
}
