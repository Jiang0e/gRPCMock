package com.demo.proto.client;

import com.demo.proto.server.MockDevice;
import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import telemetry.*;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HClient {
    private final ManagedChannel channel;
    private final SubscribeGrpc.SubscribeBlockingStub blockingStub;
    private static final Logger logger = Logger.getLogger(HClient.class.getName());

    public HClient(String host,int port){
        channel = ManagedChannelBuilder.forAddress(host,port)
                .usePlaintext(true)
                .build();

        blockingStub = SubscribeGrpc.newBlockingStub(channel);
    }


    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public  void pushData(Telemetry telemetry){
        Telemetry response;
        try{
            response = blockingStub.subscribeData(telemetry);
        } catch (StatusRuntimeException e)
        {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("Message from gRPC-Server: "+response.toString());
    }

    public static void main(String[] args) throws InterruptedException, UnsupportedEncodingException {
        HClient client = new HClient("127.0.0.1",50051);
        try{
            //TODO 1. 收到静态配置

            //TODO 2. 模拟采样数据
            Telemetry telemetry = new MockDevice().mockData();
            //TODO 3. 推送采样数据到采集器
            long start = System.currentTimeMillis();
            client.pushData(telemetry);
            long end = System.currentTimeMillis();
            logger.info("time: "+(end-start)*1.0/1000/60+" 分钟");
        }finally {
            client.shutdown();
        }
    }
}
