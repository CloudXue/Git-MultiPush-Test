package com.fingard.ncbc.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务器启动类
 * @author 屠耀锋
 * @Date 2019-04-25
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    /**
     * Organization Tree
     * @param  args 请求参数
     * @throws Exception
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }

}
