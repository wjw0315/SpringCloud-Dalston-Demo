package com.wjwcloud.modules.testcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DcController {


    @Autowired
    RestTemplate restTemplate;

    @Autowired
    LoadBalancerClient loadBalancerClient;


    @GetMapping("consumer")
    public  String Dc(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
        String url = "http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/client";
        System.out.print(url);
        return  restTemplate.getForObject(url,String.class);
    }
}
