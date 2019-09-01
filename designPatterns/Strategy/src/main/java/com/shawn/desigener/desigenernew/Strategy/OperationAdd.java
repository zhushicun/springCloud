package com.shawn.desigener.desigenernew.Strategy;

public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        return a+b;
    }
}
