package com.shawn.desigener.prototype;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        AbstractShape shape = ShapeCache.getShape("1");
        AbstractShape shape1 = ShapeCache.getShape("2");
        shape.draw();
        shape1.draw();
    }
}
