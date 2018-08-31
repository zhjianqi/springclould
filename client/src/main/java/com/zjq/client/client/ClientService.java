package com.zjq.client.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service" )
@Service("clientService")
public interface ClientService {
    @RequestMapping(value = "/hello")
    String sayHello(@RequestParam(name = "name") String name);
}
