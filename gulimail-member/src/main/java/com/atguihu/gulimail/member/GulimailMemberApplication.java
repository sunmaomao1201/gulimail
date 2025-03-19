package com.atguihu.gulimail.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("com.atguihu.gulimail.member.dao")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.atguihu.gulimail.member.feign")
public class GulimailMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimailMemberApplication.class, args);
    }

}
