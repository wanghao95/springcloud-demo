package com.feign.Hystrix;

import com.feign.feign.TestService;
import org.springframework.stereotype.Component;

@Component
public class TestHystrix implements TestService {

    @Override
    public String testHello(String name) {
        return "request failed,execute hello hystrix";
    }
}
