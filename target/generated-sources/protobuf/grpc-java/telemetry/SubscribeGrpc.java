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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.14.0)",
    comments = "Source: telemetry.proto")
public final class SubscribeGrpc {

  private SubscribeGrpc() {}

  public static final String SERVICE_NAME = "helloworld.Subscribe";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<telemetry.Telemetry,
      telemetry.Telemetry> getSubscribeDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeData",
      requestType = telemetry.Telemetry.class,
      responseType = telemetry.Telemetry.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<telemetry.Telemetry,
      telemetry.Telemetry> getSubscribeDataMethod() {
    io.grpc.MethodDescriptor<telemetry.Telemetry, telemetry.Telemetry> getSubscribeDataMethod;
    if ((getSubscribeDataMethod = SubscribeGrpc.getSubscribeDataMethod) == null) {
      synchronized (SubscribeGrpc.class) {
        if ((getSubscribeDataMethod = SubscribeGrpc.getSubscribeDataMethod) == null) {
          SubscribeGrpc.getSubscribeDataMethod = getSubscribeDataMethod = 
              io.grpc.MethodDescriptor.<telemetry.Telemetry, telemetry.Telemetry>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "helloworld.Subscribe", "SubscribeData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  telemetry.Telemetry.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  telemetry.Telemetry.getDefaultInstance()))
                  .setSchemaDescriptor(new SubscribeMethodDescriptorSupplier("SubscribeData"))
                  .build();
          }
        }
     }
     return getSubscribeDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<telemetry.Telemetry,
      telemetry.Status> getIsConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "isConfig",
      requestType = telemetry.Telemetry.class,
      responseType = telemetry.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<telemetry.Telemetry,
      telemetry.Status> getIsConfigMethod() {
    io.grpc.MethodDescriptor<telemetry.Telemetry, telemetry.Status> getIsConfigMethod;
    if ((getIsConfigMethod = SubscribeGrpc.getIsConfigMethod) == null) {
      synchronized (SubscribeGrpc.class) {
        if ((getIsConfigMethod = SubscribeGrpc.getIsConfigMethod) == null) {
          SubscribeGrpc.getIsConfigMethod = getIsConfigMethod = 
              io.grpc.MethodDescriptor.<telemetry.Telemetry, telemetry.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "helloworld.Subscribe", "isConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  telemetry.Telemetry.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  telemetry.Status.getDefaultInstance()))
                  .setSchemaDescriptor(new SubscribeMethodDescriptorSupplier("isConfig"))
                  .build();
          }
        }
     }
     return getIsConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<telemetry.Status,
      telemetry.Config> getConfigurationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Configuration",
      requestType = telemetry.Status.class,
      responseType = telemetry.Config.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<telemetry.Status,
      telemetry.Config> getConfigurationMethod() {
    io.grpc.MethodDescriptor<telemetry.Status, telemetry.Config> getConfigurationMethod;
    if ((getConfigurationMethod = SubscribeGrpc.getConfigurationMethod) == null) {
      synchronized (SubscribeGrpc.class) {
        if ((getConfigurationMethod = SubscribeGrpc.getConfigurationMethod) == null) {
          SubscribeGrpc.getConfigurationMethod = getConfigurationMethod = 
              io.grpc.MethodDescriptor.<telemetry.Status, telemetry.Config>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "helloworld.Subscribe", "Configuration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  telemetry.Status.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  telemetry.Config.getDefaultInstance()))
                  .setSchemaDescriptor(new SubscribeMethodDescriptorSupplier("Configuration"))
                  .build();
          }
        }
     }
     return getConfigurationMethod;
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
   */
  public static abstract class SubscribeImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *实现订阅数据源的服务
     * </pre>
     */
    public void subscribeData(telemetry.Telemetry request,
        io.grpc.stub.StreamObserver<telemetry.Telemetry> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeDataMethod(), responseObserver);
    }

    /**
     * <pre>
     *反馈是否服务端下发了配置
     * </pre>
     */
    public void isConfig(telemetry.Telemetry request,
        io.grpc.stub.StreamObserver<telemetry.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getIsConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     *启动配置静态订阅
     * </pre>
     */
    public void configuration(telemetry.Status request,
        io.grpc.stub.StreamObserver<telemetry.Config> responseObserver) {
      asyncUnimplementedUnaryCall(getConfigurationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSubscribeDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                telemetry.Telemetry,
                telemetry.Telemetry>(
                  this, METHODID_SUBSCRIBE_DATA)))
          .addMethod(
            getIsConfigMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                telemetry.Telemetry,
                telemetry.Status>(
                  this, METHODID_IS_CONFIG)))
          .addMethod(
            getConfigurationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                telemetry.Status,
                telemetry.Config>(
                  this, METHODID_CONFIGURATION)))
          .build();
    }
  }

  /**
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
     * <pre>
     *实现订阅数据源的服务
     * </pre>
     */
    public void subscribeData(telemetry.Telemetry request,
        io.grpc.stub.StreamObserver<telemetry.Telemetry> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubscribeDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *反馈是否服务端下发了配置
     * </pre>
     */
    public void isConfig(telemetry.Telemetry request,
        io.grpc.stub.StreamObserver<telemetry.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIsConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *启动配置静态订阅
     * </pre>
     */
    public void configuration(telemetry.Status request,
        io.grpc.stub.StreamObserver<telemetry.Config> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConfigurationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
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
     * <pre>
     *实现订阅数据源的服务
     * </pre>
     */
    public telemetry.Telemetry subscribeData(telemetry.Telemetry request) {
      return blockingUnaryCall(
          getChannel(), getSubscribeDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *反馈是否服务端下发了配置
     * </pre>
     */
    public telemetry.Status isConfig(telemetry.Telemetry request) {
      return blockingUnaryCall(
          getChannel(), getIsConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *启动配置静态订阅
     * </pre>
     */
    public telemetry.Config configuration(telemetry.Status request) {
      return blockingUnaryCall(
          getChannel(), getConfigurationMethod(), getCallOptions(), request);
    }
  }

  /**
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
     * <pre>
     *实现订阅数据源的服务
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<telemetry.Telemetry> subscribeData(
        telemetry.Telemetry request) {
      return futureUnaryCall(
          getChannel().newCall(getSubscribeDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *反馈是否服务端下发了配置
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<telemetry.Status> isConfig(
        telemetry.Telemetry request) {
      return futureUnaryCall(
          getChannel().newCall(getIsConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *启动配置静态订阅
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<telemetry.Config> configuration(
        telemetry.Status request) {
      return futureUnaryCall(
          getChannel().newCall(getConfigurationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBSCRIBE_DATA = 0;
  private static final int METHODID_IS_CONFIG = 1;
  private static final int METHODID_CONFIGURATION = 2;

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
          serviceImpl.subscribeData((telemetry.Telemetry) request,
              (io.grpc.stub.StreamObserver<telemetry.Telemetry>) responseObserver);
          break;
        case METHODID_IS_CONFIG:
          serviceImpl.isConfig((telemetry.Telemetry) request,
              (io.grpc.stub.StreamObserver<telemetry.Status>) responseObserver);
          break;
        case METHODID_CONFIGURATION:
          serviceImpl.configuration((telemetry.Status) request,
              (io.grpc.stub.StreamObserver<telemetry.Config>) responseObserver);
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
              .addMethod(getIsConfigMethod())
              .addMethod(getConfigurationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
