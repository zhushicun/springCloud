package com.shawn.desigener.Handler.Impl;

import com.shawn.desigener.Handler.parentInterface.GateAwayHandler;

public class AliHandler extends GateAwayHandler {
    @Override
    public void service() {
        System.out.println("ali限流");
        nextService();
    }
}
