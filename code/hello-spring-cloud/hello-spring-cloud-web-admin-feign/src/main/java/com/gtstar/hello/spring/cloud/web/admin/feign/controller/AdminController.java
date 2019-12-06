package com.gtstar.hello.spring.cloud.web.admin.feign.controller;

import com.gtstar.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName AdminController
 * @Description TODO
 * @Author yuxiang
 * @Date 2019/12/6 13:51
 **/
@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/testConsumerFeign")
    public String testConsumerFeign(@RequestParam(value = "message",required = false) String message){
        return adminService.testConsumerFeign(message);
    }
}
