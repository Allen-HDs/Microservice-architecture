package com.gtstar.hello.spring.cloud.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName AdminService
 * @Description TODO
 * @Author yuxiang
 * @Date 2019/12/5 18:00
 **/
@Service
public class AdminService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "discoryError")//服务崩了就会调用 discoryError 方法
    public String testConsumer(String message){
        return restTemplate.getForObject("http://HELLO-SPRING-CLOUD-SERVICE-ADMIN/testProvider?message="+message, String.class);
    }

    public String discoryError(String message){
        return String.format("Your Message Is: %s ,But Request Error",message);
    }
}
