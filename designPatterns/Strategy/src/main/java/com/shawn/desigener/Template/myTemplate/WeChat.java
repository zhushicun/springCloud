package com.shawn.desigener.Template.myTemplate;

import com.shawn.desigener.Template.myAbstract.PayTemplate;

import java.util.Map;

public class WeChat extends PayTemplate{
    @Override
    public Map<String, String> Verify() {
        return null;
    }

    @Override
    public String resultFail() {
        return "wechat is fail";
    }
}
