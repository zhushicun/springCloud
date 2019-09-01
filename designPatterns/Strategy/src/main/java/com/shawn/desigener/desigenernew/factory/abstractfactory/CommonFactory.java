package com.shawn.desigener.desigenernew.factory.abstractfactory;

public abstract class CommonFactory {
    public abstract Shape shape(String key);
    public abstract Color color(String key);
}
