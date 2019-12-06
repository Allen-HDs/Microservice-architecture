package com.gtstar.hello.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName AdminController
 * @Description TODO
 * @Author yuxiang
 * @Date 2019/12/5 16:54
 **/
@RestController
public class AdminController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/testProvider")
    public String testProvider(@RequestParam(value = "message",required = false) String message){
        return String.format("Hi,You Message is : %s and Port is: %s",message,port);
    }
}
