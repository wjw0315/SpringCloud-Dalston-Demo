package com.wjwcloud.modules.test.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client")
public interface DcService {

        @GetMapping("/client")
        String consumerDc();
}
