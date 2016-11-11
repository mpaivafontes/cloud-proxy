package com.cloud.proxy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

import static org.springframework.boot.SpringApplication.run

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
class BootApplication {

    static void main(String[] args) {
        run BootApplication, args
    }
}
