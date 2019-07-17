package com.feign.controller;

import com.feign.feign.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private TestService testService;

    @RequestMapping("/hi")
    public String test(String name){
        return testService.testHello(name);
    }
}
