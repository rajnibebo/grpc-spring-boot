package com.rajni.feeds.app.service;

import com.rajni.feeds.proto.FeedRequest;
import com.rajni.feeds.proto.FeedResponse;
import com.rajni.feeds.proto.FeedServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

@Service
public class FeedRequestService extends FeedServiceGrpc.FeedServiceImplBase {
    @Override
    public void feedTransform(FeedRequest request, StreamObserver<FeedResponse> responseObserver) {
        for (int i = 0 ;i< 10; i++) {
            responseObserver.onNext(FeedResponse.newBuilder().addResponse("Response "+i).build());
        }
        responseObserver.onCompleted();
    }
}
