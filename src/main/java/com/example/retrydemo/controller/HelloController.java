package com.example.retrydemo.controller;

import com.example.retrydemo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola")
public class HelloController {

    @Autowired
    private HelloService service;

    @GetMapping
    public String ola() {
        service.retryServiceWithRecovery();
        return "Ola Mundo";
    }
}
