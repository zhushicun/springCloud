package com.shawn.desigener.desigenernew.factory.abstractfactory;

public class ColorFactory extends CommonFactory {
    @Override
    public Shape shape(String key) {
        return null;
    }

    @Override
    public Color color(String key) {
        if(key.equals("blue")){
            return new BlueColor();
        }
        if(key.equals("red")){
            return new RedColor();
        }
        return null;
    }
}
