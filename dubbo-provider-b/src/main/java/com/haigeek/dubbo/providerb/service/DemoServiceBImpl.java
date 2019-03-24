package com.haigeek.dubbo.providerb.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;
import service.DemoServiceB;

/**
 * @author zhaohj
 * @date 2019/2/24 下午9:31
 */
@Service(version = "${demo.service.version}")
public class DemoServiceBImpl implements DemoServiceB {
    @Value("${dubbo.application.name}")
    private String serviceName;

    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }

    public String sayHelloB(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }
}
