package com.shawn.desigener.Handler.parentInterface;

public abstract class GateAwayHandler {
    public GateAwayHandler gateAwayHandler;

    public abstract void service();

    public  void nextService(){
        if(gateAwayHandler!=null){
            gateAwayHandler.service();
        }
    }
    public void setGateAwayHandler(GateAwayHandler gateAwayHandler){
        this.gateAwayHandler=gateAwayHandler;
    }
}
