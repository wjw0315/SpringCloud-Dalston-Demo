package com.wjwcloud.modules.test.service;

import com.wjwcloud.commons.FormSupportConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(value = "eureka-client", configuration = FormSupportConfig.class)
public interface DcService {

        @PostMapping(value = "/uploadFile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
        String handleFileUpload(@RequestPart(value = "file") MultipartFile file);

}
