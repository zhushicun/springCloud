package com.shawn.desigener.desigenernew.builder;

public abstract class AbstractBurger implements Item{
    @Override
    public Package packageStyle() {
        return new Wrapper();
    }
}
