package com.demo.proto.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import telemetry.SReply;
import telemetry.SRequest;
import telemetry.SubscribeGrpc;

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

    public  void greet(String name){
        SRequest request = SRequest.newBuilder().setName(name).build();
        SReply response;
        try{
            response = blockingStub.subscribeData(request);
        } catch (StatusRuntimeException e)
        {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("Message from gRPC-Server: "+response.getMessage());
    }

    public static void main(String[] args) throws InterruptedException {
        HClient client = new HClient("127.0.0.1",50051);
        try{
            String user = "world";
            long start = System.currentTimeMillis();
            client.greet(user);

            long end = System.currentTimeMillis();
            logger.info("time: "+(end-start)*1.0/1000/60+" 分钟");
        }finally {
            client.shutdown();
        }
    }
}
