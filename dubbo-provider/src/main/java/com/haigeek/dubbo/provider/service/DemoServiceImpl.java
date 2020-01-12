package com.haigeek.dubbo.provider.service;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author zhaohj
 * @date 2019/2/24 下午9:31
 */
@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService{


    @Value("${dubbo.application.name}")
    private String serviceName;

    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }
}
