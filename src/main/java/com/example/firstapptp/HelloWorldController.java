package com.example.firstapptp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    // 3. Spring Boot Hello World REST API
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }
}
