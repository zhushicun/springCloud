package com.shawn.desigener.desigenernew.builder;

public abstract class AbstractDrink implements Item{
    @Override
    public Package packageStyle() {
        return new Bottle();
    }
}
