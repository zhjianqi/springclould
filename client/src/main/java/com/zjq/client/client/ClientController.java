package com.zjq.client.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;
    @RequestMapping(value = "hello2")
    public String hello2(@RequestParam String name) {
        return clientService.sayHello(name);
    }


}
