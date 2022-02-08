package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestTestController {

    RestTestController() {

    }

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/test")
    String all() {
        return "YAY!!";
    }

}
