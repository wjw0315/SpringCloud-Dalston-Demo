package com.wjwcloud.modules.testcontrolller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DcController {

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping("client")
    public int Dc(){
        List<String> list = discoveryClient.getServices();
        System.out.print(list);
        return  list.size();
    }

}
