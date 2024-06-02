package com.outmanwuhx.rpcprovider1;

import com.outmanwuhx.rpccommon.annotation.EnableProviderRpc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProviderRpc
public class OutmanWuhxRpcProvider1Application {

    public static void main(String[] args) {
        SpringApplication.run(OutmanWuhxRpcProvider1Application.class, args);
    }

}
