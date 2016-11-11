package com.cloud.proxy.config

import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

/**
 * Created by marcelo.fontes on 08/11/16.
 */
@Configuration
class Config {
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        [] as RestTemplate
    }
}