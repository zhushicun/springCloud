package com.shawn.desigener.desigenernew.factory.abstractfactory;

public class FactoryProducer {
    public static CommonFactory getFactory(String key){
        if(key.equals("shape")){
            return new ShapeFactory();
        }
        if(key.equals("color")){
            return new ColorFactory();
        }
        return null;
    }
}
