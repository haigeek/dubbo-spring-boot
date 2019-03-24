package com.haigeek.dubbo.providerb.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * @author zhaohj
 * @date 2019/2/24 下午9:15
 */

@EnableAutoConfiguration
public class DubboProviderbBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderbBootstrap.class,args);
    }
}
