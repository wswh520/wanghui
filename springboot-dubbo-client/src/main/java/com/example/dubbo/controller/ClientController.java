package com.example.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

//    @Reference(version = "1.0.0")
//    private DubboServerService dubboServerService;

    @RequestMapping("client")
    public String client(String parm){
        return parm;
    }
}
