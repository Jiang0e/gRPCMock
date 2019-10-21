package com.demo.proto.server;

import telemetry.Telemetry;

import java.util.HashMap;
import java.util.Map;

public class Analyzer {
    public Map<String, Object> analyse(Telemetry telemetry) {
        //此处分析数据，返回分析后的数据
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("telemetry",telemetry);
        result.put("result","ok");
        return result;
    }
}
