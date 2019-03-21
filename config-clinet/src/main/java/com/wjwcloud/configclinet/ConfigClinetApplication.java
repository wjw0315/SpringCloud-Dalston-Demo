package com.wjwcloud.configclinet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClinetApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClinetApplication.class, args);
	}

    @Value("${info.user}")
    String info;

    @RequestMapping(value = "/test")
    public String hi(){
        return info;
    }
}
