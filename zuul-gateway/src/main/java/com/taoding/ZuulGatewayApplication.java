package com.taoding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * ZuulGatewayApplication
 *
 * @author primo
 * @date 2019/11/13
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ZuulGatewayApplication {

    public static void main(String[] args){
        SpringApplication.run(ZuulGatewayApplication.class, args);
    }
}
