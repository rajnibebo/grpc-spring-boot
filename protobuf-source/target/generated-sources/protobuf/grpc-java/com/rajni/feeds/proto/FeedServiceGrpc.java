package com.rajni.feeds.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.0)",
    comments = "Source: feeds.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FeedServiceGrpc {

  private FeedServiceGrpc() {}

  public static final String SERVICE_NAME = "com.rajni.feeds.proto.FeedService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.rajni.feeds.proto.FeedRequest,
      com.rajni.feeds.proto.FeedResponse> getFeedTransformMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FeedTransform",
      requestType = com.rajni.feeds.proto.FeedRequest.class,
      responseType = com.rajni.feeds.proto.FeedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rajni.feeds.proto.FeedRequest,
      com.rajni.feeds.proto.FeedResponse> getFeedTransformMethod() {
    io.grpc.MethodDescriptor<com.rajni.feeds.proto.FeedRequest, com.rajni.feeds.proto.FeedResponse> getFeedTransformMethod;
    if ((getFeedTransformMethod = FeedServiceGrpc.getFeedTransformMethod) == null) {
      synchronized (FeedServiceGrpc.class) {
        if ((getFeedTransformMethod = FeedServiceGrpc.getFeedTransformMethod) == null) {
          FeedServiceGrpc.getFeedTransformMethod = getFeedTransformMethod =
              io.grpc.MethodDescriptor.<com.rajni.feeds.proto.FeedRequest, com.rajni.feeds.proto.FeedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FeedTransform"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rajni.feeds.proto.FeedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rajni.feeds.proto.FeedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FeedServiceMethodDescriptorSupplier("FeedTransform"))
              .build();
        }
      }
    }
    return getFeedTransformMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FeedServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedServiceStub>() {
        @java.lang.Override
        public FeedServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedServiceStub(channel, callOptions);
        }
      };
    return FeedServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FeedServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedServiceBlockingStub>() {
        @java.lang.Override
        public FeedServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedServiceBlockingStub(channel, callOptions);
        }
      };
    return FeedServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FeedServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedServiceFutureStub>() {
        @java.lang.Override
        public FeedServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedServiceFutureStub(channel, callOptions);
        }
      };
    return FeedServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class FeedServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void feedTransform(com.rajni.feeds.proto.FeedRequest request,
        io.grpc.stub.StreamObserver<com.rajni.feeds.proto.FeedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFeedTransformMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFeedTransformMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.rajni.feeds.proto.FeedRequest,
                com.rajni.feeds.proto.FeedResponse>(
                  this, METHODID_FEED_TRANSFORM)))
          .build();
    }
  }

  /**
   */
  public static final class FeedServiceStub extends io.grpc.stub.AbstractAsyncStub<FeedServiceStub> {
    private FeedServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedServiceStub(channel, callOptions);
    }

    /**
     */
    public void feedTransform(com.rajni.feeds.proto.FeedRequest request,
        io.grpc.stub.StreamObserver<com.rajni.feeds.proto.FeedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFeedTransformMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FeedServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FeedServiceBlockingStub> {
    private FeedServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.rajni.feeds.proto.FeedResponse feedTransform(com.rajni.feeds.proto.FeedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFeedTransformMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FeedServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FeedServiceFutureStub> {
    private FeedServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rajni.feeds.proto.FeedResponse> feedTransform(
        com.rajni.feeds.proto.FeedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFeedTransformMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FEED_TRANSFORM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FeedServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FeedServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FEED_TRANSFORM:
          serviceImpl.feedTransform((com.rajni.feeds.proto.FeedRequest) request,
              (io.grpc.stub.StreamObserver<com.rajni.feeds.proto.FeedResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class FeedServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FeedServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.rajni.feeds.proto.Feeds.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FeedService");
    }
  }

  private static final class FeedServiceFileDescriptorSupplier
      extends FeedServiceBaseDescriptorSupplier {
    FeedServiceFileDescriptorSupplier() {}
  }

  private static final class FeedServiceMethodDescriptorSupplier
      extends FeedServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FeedServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FeedServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FeedServiceFileDescriptorSupplier())
              .addMethod(getFeedTransformMethod())
              .build();
        }
      }
    }
    return result;
  }
}
