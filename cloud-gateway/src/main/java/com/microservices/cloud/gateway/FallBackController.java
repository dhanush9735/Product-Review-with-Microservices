package com.microservices.cloud.gateway;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
    @GetMapping("/productFallback")
    public String productServiceFallback(){
        return "Product Service failed to respond";
    }

    @GetMapping("/feedbacksFallback")
    public String feedbacksServiceFallback(){
        return "Feedbacks Service failed to respond";
    }
}
