package com.demo.proto.client;

import com.demo.proto.server.MockDevice;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import telemetry.Config;
import telemetry.Status;
import telemetry.SubscribeGrpc;
import telemetry.Telemetry;

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
    //监听服务器是否下发配置，收到静态配置
    public  Config pullConfig(Telemetry telemetry){
        Status status = null;
        Config response=null;
        try{
            status = blockingStub.isConfig(telemetry);
            if("start".equals(status.getStatus())) {
                logger.info("gRPC-Server has distributed configuration.");
                response = blockingStub.configuration(status);
            }
        } catch (StatusRuntimeException e)
        {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return null;
        }
        logger.info("Configuration from gRPC-Server: "+response.toString());
        return response;
    }

    //根据订阅配置，设置推送周期时间，推送采样数据到采集器
    public  void pushData(Telemetry telemetry,Config config){
        if(config != null) {
            Telemetry response;
            try {
                response = blockingStub.subscribeData(telemetry);
            } catch (StatusRuntimeException e) {
                logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
                return;
            }
            logger.info("Message from gRPC-Server: \n" + response.toString());
        } else {
            logger.info("There is no configuration");
        }
    }

    public Telemetry update(Config config, Telemetry telemetry) {
        //根据config修改telemetry的值
        return telemetry;
    }

    public static void main(String[] args) throws InterruptedException {
        HClient client = new HClient("127.0.0.1",50051);
        try{
            //TODO 1. 模拟采样数据
            Telemetry telemetry = new MockDevice().mockData();
            //TODO 2. 监听服务器是否下发配置，收到静态配置
            Config config = client.pullConfig(telemetry);
            //TODO 3. 更改配置
            telemetry = client.update(config,telemetry);
            //TODO 4. 根据订阅配置，设置推送周期时间，推送采样数据到采集器
            client.pushData(telemetry,config);
        }finally {
            client.shutdown();
        }
    }

}
