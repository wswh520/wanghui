package com.example.dubbo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @RequestMapping("client")
    public String client(String parm){
        return parm;
    }
}
