package com.taoding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * CircuitBreakerApplication
 *
 * @author primo
 * @date 2019/11/14
 */

@EnableCircuitBreaker
@SpringBootApplication
@EnableDiscoveryClient
public class CircuitBreakerApplication {

    public static void main(String[] args){
        SpringApplication.run(CircuitBreakerApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate rest(RestTemplateBuilder builder) {
        return builder.build();
    }
}
