package com.atguihu.gulimail.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.atguihu.gulimail.ware.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GilimailWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(GilimailWareApplication.class, args);
    }

}
