package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DemoController {

    @GetMapping("/greet")
    public String sayHello() {
        return "hello, have a nice date.";
    }

    @GetMapping("/greet/{name}")
    public String sayHelloToName(@PathVariable("name") String name) {
        return "Hello, " + name + " have a nice day";
    }
}
