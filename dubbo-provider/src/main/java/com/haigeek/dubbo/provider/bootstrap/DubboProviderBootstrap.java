package com.haigeek.dubbo.provider.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.Environment;

/**
 * @author zhaohj
 * @date 2019/2/24 下午9:15
 */

@EnableAutoConfiguration
public class DubboProviderBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderBootstrap.class,args);
    }
}
