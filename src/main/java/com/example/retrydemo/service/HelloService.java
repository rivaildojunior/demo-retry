package com.example.retrydemo.service;

import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Retryable(value = RuntimeException.class)
    public void retryServiceWithRecovery() {
        System.out.println("Retryable");
        int a = 1/1;
    }

    @Recover
    public void recover(RuntimeException e, String sql){
        System.out.println("Recover");
    }
}
