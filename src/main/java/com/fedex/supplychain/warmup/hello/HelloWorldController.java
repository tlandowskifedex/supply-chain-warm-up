package com.fedex.supplychain.warmup.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public HelloWorldMessage sayHello() {
        return new HelloWorldMessage();
    }

    private static final class HelloWorldMessage {
        public final String message = "Hello world";
    }
}
