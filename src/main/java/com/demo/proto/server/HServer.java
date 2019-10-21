package com.demo.proto.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import telemetry.Config;
import telemetry.Status;
import telemetry.SubscribeGrpc;
import telemetry.Telemetry;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        public void isConfig(Telemetry request, StreamObserver<Status> responseObserver) {
            //判断对应的设备有没有下发静态配置
            //request.getNodeIdStr(); //对应的设备
            //假设已下发
            Status status = Status.newBuilder().setStatus("start").build();
            responseObserver.onNext(status);
            responseObserver.onCompleted();
        }

        @Override
        public void configuration(Status status, StreamObserver<Config> responseObserver){
            //TODO 返回周期等配置信息
            Config result = Config.newBuilder().setPeriod("10").build();
            responseObserver.onNext(result);
            responseObserver.onCompleted();
            System.out.println("---------Configuration START----------\n" +
                    result.toString()+
                    "---------Configuration END----------\n");
        }
        @Override
        public void subscribeData(Telemetry telemetry, StreamObserver<Telemetry> responseObserver){
            //TODO 1. 分析器分析数据后将采集结果给控制器
            Map<String, Object> analysedData = new Analyzer().analyse(telemetry);
            //TODO 2. 控制器进行调整参数？ 输出

            responseObserver.onNext((Telemetry)analysedData.get("telemetry"));
            responseObserver.onCompleted();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
            System.out.println("---------START----------\n" +
                    "Message from gRPC-Client:\n" + telemetry.toString()+
                    "----Analysed Result:" + analysedData.get("result")+
                    "----\n----Current Time:" + df.format(new Date())+
                    "----\n-----------END----------\n");
        }
    }

}
