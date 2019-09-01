package com.shawn.desigener.desigenernew.Bridge;

public class DrawGreen implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("画一个绿色的圆圈:"+radius+","+","+y);
    }
}
