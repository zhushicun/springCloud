package com.shawn.desigener.Template.myTemplate;

import com.shawn.desigener.Template.myAbstract.PayTemplate;

import java.util.HashMap;
import java.util.Map;

public class AliPay extends PayTemplate {
    @Override
    public Map<String, String> Verify() {
        Map map = new HashMap();
        map.put("sdsdf","sdfa");
        return map;
    }

    @Override
    public String resultFail() {
        return "ALIpAY IS SUCCESS";
    }
}
