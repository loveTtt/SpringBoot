package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

//@EnableZuulProxy
@SpringBootApplication
@ComponentScan({"com.saas.service","com.saas.controller","com.saas.message"})
@EnableCaching
public class SaasCtmsApliction {
    public static void main(String[] args) {
        SpringApplication.run(SaasCtmsApliction.class, args);
    }
}
