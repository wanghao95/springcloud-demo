package com.feign.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    public Retryer feignRetryer(){
        return new Retryer.Default(100,1000,5);//重试问隔为 100 毫秒，最大重试时间为1秒，重试次数为5次。
    }
}
