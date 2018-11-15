package com.orion.bootu.apigateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@Slf4j
public class BootuApigatewayApplication {

    public static void main(String[] args) {
        log.info("Start BootuApigatewayApplication");
        SpringApplication.run(BootuApigatewayApplication.class, args);
    }
}
