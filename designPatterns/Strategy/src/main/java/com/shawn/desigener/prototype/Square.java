package com.shawn.desigener.prototype;

public class Square extends AbstractShape {
    public Square(){
        type="Square";
    }
    @Override
    public void draw() {
        System.out.println("Square draw...");
    }
}
