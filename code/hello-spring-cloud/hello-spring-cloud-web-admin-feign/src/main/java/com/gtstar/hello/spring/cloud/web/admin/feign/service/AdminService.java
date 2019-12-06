package com.gtstar.hello.spring.cloud.web.admin.feign.service;

import com.gtstar.hello.spring.cloud.web.admin.feign.service.impl.AdminServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "hello-spring-cloud-service-admin",fallback = AdminServiceImpl.class)
public interface AdminService {
    @GetMapping("/testProvider")
    String testConsumerFeign(@RequestParam(value = "message",required = false) String message);
}
