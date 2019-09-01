package com.shawn.desigener.compoment.myImple;

import com.shawn.desigener.compoment.Decorate.AbstractDecorate;
import com.shawn.desigener.compoment.myInterface.GateAwayCompent;

public class LogCompent extends AbstractDecorate {

    public LogCompent(GateAwayCompent gateAwayCompent) {
        super(gateAwayCompent);
    }
    @Override
    public void service() {
        super.service();
        System.out.println("Log。。。");
    }
}
