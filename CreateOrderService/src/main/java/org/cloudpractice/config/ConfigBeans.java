package org.cloudpractice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBeans {

    // configure RestTemplate to inject bean
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
