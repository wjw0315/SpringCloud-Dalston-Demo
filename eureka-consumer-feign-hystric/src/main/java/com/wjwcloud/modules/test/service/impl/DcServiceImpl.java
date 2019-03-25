package com.wjwcloud.modules.test.service.impl;

import com.wjwcloud.modules.test.service.DcService;
import org.springframework.stereotype.Component;

@Component
public class DcServiceImpl implements DcService {

    @Override
    public String consumerDc() {
        return "feign断路器";
    }
}
