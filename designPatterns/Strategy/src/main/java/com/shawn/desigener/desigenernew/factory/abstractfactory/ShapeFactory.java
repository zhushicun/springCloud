package com.shawn.desigener.desigenernew.factory.abstractfactory;

public class ShapeFactory extends CommonFactory {
    @Override
    public Shape shape(String key) {
        if(key.equals("old")){
            return new OldShape();
        }
        if(key.equals("new")){
            return new NewShape();
        }
        return null;
    }

    @Override
    public Color color(String key) {
        return null;
    }
}
