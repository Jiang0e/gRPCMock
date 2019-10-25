package com.demo.proto.client;

import com.demo.proto.server.MockDevice;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import telemetry.Config;
import telemetry.Status;
import telemetry.SubscribeGrpc;
import telemetry.Telemetry;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    //判断服务器是否下发配置，收到静态配置
    public  Config pullConfig(Telemetry telemetry){
        Status status = null;
        Config response=null;
        try{
            status = blockingStub.isConfig(telemetry);
            if("start".equals(status.getStatus())) {
                logger.info("服务端已下发配置");
                response = blockingStub.configuration(status);
            }
        } catch (StatusRuntimeException e)
        {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return null;
        }
        logger.info("来自服务端的配置信息：\n"+response.toString());
        return response;
    }

    //根据订阅配置，设置推送周期时间，推送采样数据到服务端的采集器
    public  void pushData(Telemetry telemetry,Config config) throws InterruptedException {
        if(config != null) {
            Telemetry response =null;
            try {
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String first_time = config.getFirstTime();
                String end_time = config.getEndTime();
                String period = config.getPeriod();
                String currentTime = df.format(new Date());
                while (currentTime.compareTo(first_time) < 0 ){
                    Thread.sleep(df.parse(first_time).getTime() - df.parse(currentTime).getTime());
                    currentTime = df.format(new Date());
                }
                int count = 0;
                while (currentTime.compareTo(first_time)>=0 && currentTime.compareTo(end_time)<=0){
                    response = blockingStub.subscribeData(telemetry);
                    count++;
                    logger.info("发送次数: 第" + count +"次. 当前时间: "+ df.format(new Date()));
                    Thread.sleep((long) Integer.parseInt(period)*1000);
                    currentTime = df.format(new Date());
                }
            } catch (StatusRuntimeException e) {
                logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
                return;
            } catch (ParseException e) {
                e.printStackTrace();
            }
            logger.info("服务端调整参数信息: \n" + response.toString());
        } else {
            logger.info("服务端未下发配置");
        }
    }

    public Telemetry update(Config config, Telemetry telemetry) {
        //根据config修改telemetry的值
        return telemetry;
    }

    public static void main(String[] args) throws InterruptedException {
        HClient client = new HClient("127.0.0.1",50051);
        try{
            //TODO 模拟采样数据
            Telemetry telemetry = new MockDevice().mockData();
            //TODO 2. 判断服务器是否下发配置，收到静态配置
            Config config = client.pullConfig(telemetry);
            //TODO 3. 更改配置
            telemetry = client.update(config,telemetry);
            //TODO 4. 根据订阅配置，设置推送周期时间，推送采样数据到服务端的采集器
            client.pushData(telemetry,config);
        }finally {
            client.shutdown();
        }
    }

}
