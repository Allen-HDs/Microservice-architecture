package com.gtstar.hello.spring.cloud.web.admin.ribbon.controller;

import com.gtstar.hello.spring.cloud.web.admin.ribbon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @ClassName AdminController
 * @Description TODO
 * @Author yuxiang
 * @Date 2019/12/5 18:04
 **/
@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/testConsumer")
    public String testConsumer(@RequestParam(value = "message",required = false) String message){
        return adminService.testConsumer(message);
    }
}
