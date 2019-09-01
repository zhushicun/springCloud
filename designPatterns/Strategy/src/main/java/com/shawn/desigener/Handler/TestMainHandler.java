package com.shawn.desigener.Handler;

import com.shawn.desigener.Handler.Impl.AliHandler;
import com.shawn.desigener.Handler.Impl.WechatHandler;

public class TestMainHandler {
    public static void main(String[] args) {
        WechatHandler wechatHandler=new WechatHandler();
        AliHandler aliHandler= new AliHandler();
        wechatHandler.setGateAwayHandler(aliHandler);
        wechatHandler.service();
    }
}
