package com.wjwcloud.commons;

import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FormSupportConfig {

    // new一个form编码器，实现支持form表单提交
    @Bean
    public Encoder feignFormEncoder() {
        return new SpringFormEncoder();
    }
}
