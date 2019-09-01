package com.shawn.desigener.desigenernew.factory.abstractfactory;

public class Test {
    public static void main(String[] args) {
        CommonFactory shapeFactory = FactoryProducer.getFactory("shape");
        shapeFactory.shape("old").getShape();
        shapeFactory.shape("new").getShape();
        CommonFactory colorFactory = FactoryProducer.getFactory("color");
        colorFactory.color("blue").getColor();
        colorFactory.color("red").getColor();
    }

}
