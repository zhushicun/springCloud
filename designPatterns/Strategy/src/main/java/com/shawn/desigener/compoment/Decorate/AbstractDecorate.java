package com.shawn.desigener.compoment.Decorate;

import com.shawn.desigener.compoment.myInterface.GateAwayCompent;

public abstract class AbstractDecorate implements GateAwayCompent {
    public GateAwayCompent gateAwayCompent;
    @Override
    public void service() {
        if(gateAwayCompent!=null)
            gateAwayCompent.service();
    }

    public AbstractDecorate(GateAwayCompent gateAwayCompent){
        this.gateAwayCompent=gateAwayCompent;
    }
}
