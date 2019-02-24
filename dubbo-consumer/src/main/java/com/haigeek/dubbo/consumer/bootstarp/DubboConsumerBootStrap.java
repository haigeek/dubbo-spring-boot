package com.haigeek.dubbo.consumer.bootstarp;

import com.haigeek.dubbo.provider.service.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author zhaohj
 * @date 2019/2/24 下午9:36
 */

@EnableAutoConfiguration
public class DubboConsumerBootStrap {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Reference(version = "${demo.service.version}")
    private DemoService demoService;

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerBootStrap.class,args).close();
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> {
            logger.info(demoService.sayHello("this is springboot+dubbo"));
        };
    }
}
