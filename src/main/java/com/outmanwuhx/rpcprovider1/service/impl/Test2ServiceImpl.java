package com.outmanwuhx.rpcprovider1.service.impl;

import com.outmanwuhx.rpccommon.annotation.RpcService;
import com.outmanwuhx.rpcprovider1.service.TestService;

@RpcService
public class Test2ServiceImpl implements TestService {
    @Override
    public String test(String key) {
        return "服务提供1 test 测试成功 :" + key;
    }
}
