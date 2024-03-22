package com.example.demo.Controler;

import com.example.demo.Service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @Autowired
    AddService addService;

    @GetMapping("/")
    public String start() {
        return "start";
    }
    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/hello/{name}")
    public String helloName( @PathVariable String name) {
        return "Hello my name is " + name;
    }

    @GetMapping("/hello/count/{num1}/{num2}")
    public String helloCount( @PathVariable int num1,@PathVariable int num2) {
        int sum = addService.add(num1,num2);
        return "sum number " + Integer.toString(num1) + " + " + Integer.toString(num2) + " = " + Integer.toString(sum) ;
    }

}
