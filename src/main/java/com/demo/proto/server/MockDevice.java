package com.demo.proto.server;

import telemetry.Telemetry;

public class MockDevice {

    public Telemetry mockData(){
        String node_id_str = "node1"; //设备名称。
        String subscription_id_str = "subscriptionName"; //订阅名称，静态配置订阅时的订阅名称，GPB编码时编码为2。
        String sensor_path = "path"; //订阅路径，GPB编码时编码为3。
        long collection_id = 1; //标识采样轮次，GPB编码时编码为4。
        long collection_start_time = 10; //标识采样轮次开始时间，GPB编码时编码为5。
        long msg_timestamp =  System.currentTimeMillis(); //生成本消息的时间戳，GPB编码时编码为6。
//            TelemetryRowGPB telemetryRowGPB = TelemetryRowGPB.newBuilder().setContent(ByteString.copyFrom("123","utf-8"))
//                    .setTimestamp(msg_timestamp).build();
//            TelemetryGPBTable data_gpb = TelemetryGPBTable.newBuilder().setRow(0,telemetryRowGPB).build(); //承载的数据由TelemetryGPBTable定义，GPB编码时编码为7。
        long collection_end_time = 20; //标识采样轮次结束时间，GPB编码时编码为8。
        int current_period = 3; //采样精度，单位是毫秒，GPB编码时编码为9。
        String except_desc = "except"; //异常描述信息，采样异常时用于上报异常信息，GPB编码时编码为10。
        String product_name = "productName"; //产品名称。
        String data_str = "12"; // 数据编码非GPB时有效，否则为空。
        Telemetry telemetry = Telemetry.newBuilder().setCollectionEndTime(collection_end_time)
                .setCollectionId(collection_id)
                .setCollectionStartTime(collection_start_time)
                .setCurrentPeriod(current_period)
//                    .setDataGpb(data_gpb)
                .setDataStr(data_str)
                .setExceptDesc(except_desc)
                .setMsgTimestamp(msg_timestamp)
                .setNodeIdStr(node_id_str)
                .setProductName(product_name)
                .setSensorPath(sensor_path)
                .setSubscriptionIdStr(subscription_id_str)
                .build();
        return telemetry;
    }

}
