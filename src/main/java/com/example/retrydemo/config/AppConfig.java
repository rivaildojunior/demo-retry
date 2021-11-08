package com.example.retrydemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;

@Configuration
@EnableRetry
public class AppConfig {


}
