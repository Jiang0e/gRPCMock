package telemetry;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *实现订阅数据源的服务
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.14.0)",
    comments = "Source: telemetry.proto")
public final class SubscribeGrpc {

  private SubscribeGrpc() {}

  public static final String SERVICE_NAME = "helloworld.Subscribe";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<telemetry.SRequest,
      telemetry.SReply> getSubscribeDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeData",
      requestType = telemetry.SRequest.class,
      responseType = telemetry.SReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<telemetry.SRequest,
      telemetry.SReply> getSubscribeDataMethod() {
    io.grpc.MethodDescriptor<telemetry.SRequest, telemetry.SReply> getSubscribeDataMethod;
    if ((getSubscribeDataMethod = SubscribeGrpc.getSubscribeDataMethod) == null) {
      synchronized (SubscribeGrpc.class) {
        if ((getSubscribeDataMethod = SubscribeGrpc.getSubscribeDataMethod) == null) {
          SubscribeGrpc.getSubscribeDataMethod = getSubscribeDataMethod = 
              io.grpc.MethodDescriptor.<telemetry.SRequest, telemetry.SReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "helloworld.Subscribe", "SubscribeData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  telemetry.SRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  telemetry.SReply.getDefaultInstance()))
                  .setSchemaDescriptor(new SubscribeMethodDescriptorSupplier("SubscribeData"))
                  .build();
          }
        }
     }
     return getSubscribeDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SubscribeStub newStub(io.grpc.Channel channel) {
    return new SubscribeStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SubscribeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SubscribeBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SubscribeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SubscribeFutureStub(channel);
  }

  /**
   * <pre>
   *实现订阅数据源的服务
   * </pre>
   */
  public static abstract class SubscribeImplBase implements io.grpc.BindableService {

    /**
     */
    public void subscribeData(telemetry.SRequest request,
        io.grpc.stub.StreamObserver<telemetry.SReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSubscribeDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                telemetry.SRequest,
                telemetry.SReply>(
                  this, METHODID_SUBSCRIBE_DATA)))
          .build();
    }
  }

  /**
   * <pre>
   *实现订阅数据源的服务
   * </pre>
   */
  public static final class SubscribeStub extends io.grpc.stub.AbstractStub<SubscribeStub> {
    private SubscribeStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SubscribeStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubscribeStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SubscribeStub(channel, callOptions);
    }

    /**
     */
    public void subscribeData(telemetry.SRequest request,
        io.grpc.stub.StreamObserver<telemetry.SReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubscribeDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *实现订阅数据源的服务
   * </pre>
   */
  public static final class SubscribeBlockingStub extends io.grpc.stub.AbstractStub<SubscribeBlockingStub> {
    private SubscribeBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SubscribeBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubscribeBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SubscribeBlockingStub(channel, callOptions);
    }

    /**
     */
    public telemetry.SReply subscribeData(telemetry.SRequest request) {
      return blockingUnaryCall(
          getChannel(), getSubscribeDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *实现订阅数据源的服务
   * </pre>
   */
  public static final class SubscribeFutureStub extends io.grpc.stub.AbstractStub<SubscribeFutureStub> {
    private SubscribeFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SubscribeFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubscribeFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SubscribeFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<telemetry.SReply> subscribeData(
        telemetry.SRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSubscribeDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBSCRIBE_DATA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SubscribeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SubscribeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBSCRIBE_DATA:
          serviceImpl.subscribeData((telemetry.SRequest) request,
              (io.grpc.stub.StreamObserver<telemetry.SReply>) responseObserver);
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

  private static abstract class SubscribeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SubscribeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return telemetry.TelemetryProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Subscribe");
    }
  }

  private static final class SubscribeFileDescriptorSupplier
      extends SubscribeBaseDescriptorSupplier {
    SubscribeFileDescriptorSupplier() {}
  }

  private static final class SubscribeMethodDescriptorSupplier
      extends SubscribeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SubscribeMethodDescriptorSupplier(String methodName) {
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
      synchronized (SubscribeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SubscribeFileDescriptorSupplier())
              .addMethod(getSubscribeDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
