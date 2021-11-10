package com.rajni.feeds.app.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.rajni"})
public class FeedRunnerApp {
    public static void main(String[] args) {
        SpringApplication.run(FeedRunnerApp.class, args);
    }
}
