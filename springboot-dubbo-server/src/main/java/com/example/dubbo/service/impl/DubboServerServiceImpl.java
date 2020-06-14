package com.example.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubbo.service.ApiService;

@Service(version = "1.0.0")
public class DubboServerServiceImpl implements ApiService {

    @Override
    public String getParm(String parm) {
        return parm;
    }
}
