package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestTestController {

    RestTestController() {

    }

    @GetMapping("/test")
    String all() {
        return "YAY!!";
    }

}
