package com.example.dubbo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

    @RequestMapping("server")
    public String server(String para){
        return para;
    }
}
