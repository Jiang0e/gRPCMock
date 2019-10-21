package com.demo.proto.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import telemetry.*;

import java.io.IOException;
import java.util.Map;
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
        public void configuration(Telemetry telemetry, StreamObserver<Telemetry> responseObserver){
            //TODO 1. 下发静态配置（启动Client）

            //TODO 3. 控制器进行调整参数？ 输出
            responseObserver.onNext(telemetry);
            responseObserver.onCompleted();
            System.out.println("---------START----------\n" +
                    "Configurate: " + telemetry.toString()+
                    "----\n-----------END----------");
        }
        @Override
        public void subscribeData(Telemetry telemetry, StreamObserver<Telemetry> responseObserver){
            //TODO 1. 下发静态配置（启动Client）

            //TODO 2. 分析器分析数据后将采集结果给控制器
            Map<String, Object> analysedData = new Analyzer().analyse(telemetry);
            //TODO 3. 控制器进行调整参数？ 输出

            responseObserver.onNext((Telemetry)analysedData.get("telemetry"));
            responseObserver.onCompleted();
            System.out.println("---------START----------\n" +
                    "Message from gRPC-Client:\n" + telemetry.toString()+
                    "----Analysed Result:" + analysedData.get("result")+
                    "----\n-----------END----------");
        }
    }

}
