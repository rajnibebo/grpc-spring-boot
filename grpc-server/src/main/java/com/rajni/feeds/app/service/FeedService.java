package com.rajni.feeds.app.service;

import com.rajni.feeds.proto.FeedRequest;
import com.rajni.feeds.proto.FeedServiceGrpc;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FeedService {

    @Autowired
    private FeedServiceGrpc.FeedServiceBlockingStub syncClient;

    public void feedText() {
        log.info("inside feedText()");

        syncClient.feedTransform(FeedRequest.newBuilder().setQuery("This is my first Query").build()).getResponseList()
                .forEach(f -> {
                    log.info("This is coming via server .. Response: "+f);
                });
    }
}
