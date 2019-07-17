package com.feign.feign;

import com.feign.Hystrix.TestHystrix;
import com.feign.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "client",configuration = FeignConfig.class,fallback = TestHystrix.class)
public interface TestService {

    @GetMapping("/hello")
    String testHello(@RequestParam(value = "name") String name);
}
