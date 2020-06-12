package com.example.dubbo.service.iml;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubbo.service.DubboServerService;

@Service
public class DubboServerServiceIml implements DubboServerService {

    @Override
    public String getParm(String parm) {
        return parm;
    }
}
