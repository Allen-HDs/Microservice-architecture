package com.gtstar.hello.spring.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
	/**
	 * @Author Allen
	 * @Description TODO
	 * @Date 11:44 2019/12/8
	 * @Param [args]
	 * @return void
	 **/
	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}

}
