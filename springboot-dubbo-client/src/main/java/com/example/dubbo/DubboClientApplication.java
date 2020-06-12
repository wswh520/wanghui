package com.example.dubbo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.dubbo"})
@MapperScan("com.example.dubbo.*") //扫描的mapper
public class DubboClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboClientApplication.class, args);
    }

}
