package com.shawn.desigener.Handler.Impl;

import com.shawn.desigener.Handler.parentInterface.GateAwayHandler;

public class WechatHandler extends GateAwayHandler {
    @Override
    public void service() {
        System.out.println("wechat名单");
        nextService();
    }
}
