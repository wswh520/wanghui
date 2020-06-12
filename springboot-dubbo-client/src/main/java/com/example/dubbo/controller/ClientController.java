package com.example.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubbo.service.ApiService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Reference(version = "1.0.0")
    private ApiService apiService;

    @RequestMapping("client")
    public String client(String parm){
        return apiService.getParm(parm);
    }
}
