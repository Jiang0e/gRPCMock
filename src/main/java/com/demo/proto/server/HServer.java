package com.demo.proto.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import telemetry.SReply;
import telemetry.SRequest;
import telemetry.SubscribeGrpc;

import java.io.IOException;
import java.util.logging.Logger;

public class HServer {
    private static final Logger logger = Logger.getLogger(HServer.class.getName());
    private int port = 50051;
    private Server server;

    private void start() throws IOException{
        server = ServerBuilder.forPort(port)
                .addService(new SubscribeImpl())
                .build()
                .start();
        logger.info("Server started, listening on "+ port);

        Runtime.getRuntime().addShutdownHook(new Thread(){

            @Override
            public void run(){

                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                HServer.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop(){
        if (server != null){
            server.shutdown();
        }
    }

    // block 一直到退出程序
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null){
            server.awaitTermination();
        }
    }


    public  static  void main(String[] args) throws IOException, InterruptedException {

        final HServer server = new HServer();
        server.start();
        server.blockUntilShutdown();
    }


    // 实现 定义一个实现服务接口的类
    private class SubscribeImpl extends SubscribeGrpc.SubscribeImplBase {

        @Override
        public void subscribeData(SRequest req, StreamObserver<SReply> responseObserver){
            //TODO 1. 下发静态配置（启动Client）

            //TODO 2. 分析器读取采集器数据

            //TODO 3. 分析器分析数据后将采集结果给控制器

            //TODO 4. 控制器进行调整参数？ 输出
            SReply reply = SReply.newBuilder().setMessage("Hello "+req.getName()).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
            System.out.println("Message from gRPC-Client:" + req.getName());
        }
    }

}
