package com.wjwcloud.modules.test.controller;

import com.wjwcloud.modules.test.service.DcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DcController {

    @Autowired
    DcService dcService;

    @GetMapping("consumer")
    public  String Dc(){
        return  dcService.consumerDc();
    }
}
