package com.shawn.desigener.desigenernew.builder;

public class Coffee extends AbstractDrink {
    @Override
    public String name() {
        return "coffee";
    }

    @Override
    public String price() {
        return "0.12$";
    }
}
