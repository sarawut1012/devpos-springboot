package com.example.demo.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("hello/{name}")
    public String helloName( @PathVariable String name) {
        return "Hello my name is " + name;
    }

}
