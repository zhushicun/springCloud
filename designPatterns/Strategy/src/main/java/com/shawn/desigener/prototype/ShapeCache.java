package com.shawn.desigener.prototype;

import java.util.HashMap;
import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String,AbstractShape> shapeHashMapCache = new Hashtable<>();

    public static AbstractShape getShape(String key){
        AbstractShape abstractShape = shapeHashMapCache.get(key);
        return (AbstractShape)abstractShape.clone();
    }

    public static void loadCache(){
        AbstractShape rectangleShape=new Rectangle();
        AbstractShape squareShape = new Square();
        shapeHashMapCache.put("1",rectangleShape);
        shapeHashMapCache.put("2",squareShape);
    }
}
