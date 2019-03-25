package com.wjwcloud.modules.test.service;

import com.wjwcloud.modules.test.service.impl.DcServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-client",fallback = DcServiceImpl.class)
public interface DcService {

        @GetMapping("/client")
        String consumerDc();
}
