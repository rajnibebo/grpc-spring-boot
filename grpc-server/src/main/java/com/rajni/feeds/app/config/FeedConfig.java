package com.rajni.feeds.app.config;

import com.rajni.feeds.app.service.FeedRequestService;
import com.rajni.feeds.proto.FeedServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.netty.shaded.io.grpc.netty.NettyServerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class FeedConfig {

    @Bean
    public Server buildServer() {
        return ServerBuilder.forPort(50051)
                .addService(new FeedRequestService())
                .build();
    }

    @Bean
    public ManagedChannel channel() {
        return ManagedChannelBuilder.forAddress("localhost", 50051).build();
    }

    @Bean
    @Scope("prototype")
    public FeedServiceGrpc.FeedServiceBlockingStub syncClient() {
        return FeedServiceGrpc.newBlockingStub(channel());
    }
}
