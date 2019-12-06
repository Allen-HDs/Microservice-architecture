package com.gtstar.hello.spring.cloud.web.admin.feign.service.impl;

import com.gtstar.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @ClassName AdminServiceImpl
 * @Description TODO
 * @Author yuxiang
 * @Date 2019/12/6 14:20
 **/
@Component
public class AdminServiceImpl implements AdminService {
    @Override
    public String testConsumerFeign(String message) {
        return String.format("Your Message Is: %s ,But Request Error",message);
    }
}
