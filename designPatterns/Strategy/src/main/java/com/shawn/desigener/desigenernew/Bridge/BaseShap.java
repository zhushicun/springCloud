package com.shawn.desigener.desigenernew.Bridge;

public abstract class BaseShap {
    DrawAPI drawAPI;

    protected BaseShap(DrawAPI drawAPI) {
        this.drawAPI=drawAPI;
    }

    public abstract void drawShap();
}
