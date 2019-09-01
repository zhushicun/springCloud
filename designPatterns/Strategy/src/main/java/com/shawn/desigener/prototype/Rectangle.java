package com.shawn.desigener.prototype;

public class Rectangle extends AbstractShape {
    public Rectangle(){
        type="Rectangle";
    }
    @Override
    public void draw() {
        System.out.println("Rectangle draw...");
    }
}
