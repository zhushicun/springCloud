package com.shawn.desigener.desigenernew.Bridge;

public class Circle extends BaseShap {
    private int x, y, radius;

    public Circle(DrawAPI drawAPI, int x, int y, int radius) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void drawMyself(){
        System.out.println("这是我自己的方法");
    }
    @Override
    public void drawShap() {
        drawAPI.drawCircle(radius,x,y);
        drawMyself();
    }
}
