package com.wjwcloud.modules.test.controller;

import com.wjwcloud.modules.test.service.DcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {

    @Autowired
    DcService dcService;

    @GetMapping("consumer")
    public  String Dc(){
        return  dcService.consumerDc();
    }
}
