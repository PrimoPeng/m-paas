package com.taoding;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import de.codecentric.boot.admin.server.domain.entities.InstanceRepository;
import de.codecentric.boot.admin.server.domain.entities.SnapshottingInstanceRepository;
import io.netty.handler.ssl.SslContextBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.audit.AuditEventRepository;
import org.springframework.boot.actuate.audit.InMemoryAuditEventRepository;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.reactive.ClientHttpConnector;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import reactor.netty.http.client.HttpClient;

/**
 * ServiceAdminApplication
 *
 * @author primo
 * @date 2019/11/14
 */
@EnableAdminServer
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceAdminApplication {

    public static void main(String[] args){
        SpringApplication.run(ServiceAdminApplication.class, args);
    }

    @Bean
    public ClientHttpConnector customHttpClient() {
        SslContextBuilder sslContext = SslContextBuilder.forClient();
        //Your sslContext customizations go here
        HttpClient httpClient = HttpClient.create().secure(
                ssl -> ssl.sslContext(sslContext)
        );
        return new ReactorClientHttpConnector(httpClient);
    }

}
