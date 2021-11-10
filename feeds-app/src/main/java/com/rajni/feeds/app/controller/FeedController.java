package com.rajni.feeds.app.controller;

import com.rajni.feeds.app.service.FeedService;
import com.rajni.feeds.proto.FeedRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feeds")
public class FeedController {

    @Autowired
    private FeedService feedService;

    @GetMapping("/ping")
    public String ping() {
        FeedRequest request = FeedRequest.newBuilder().build();
        return "Ping Successful!!";
    }

    @GetMapping("/build")
    public String buildRequest() {
        feedService.feedText();
        return "Build Success";
    }
}
