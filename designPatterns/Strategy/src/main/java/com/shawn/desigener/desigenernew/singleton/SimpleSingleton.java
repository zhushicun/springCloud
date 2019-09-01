package com.shawn.desigener.desigenernew.singleton;

public class SimpleSingleton {
    private static SimpleSingleton simpleSingleton = new SimpleSingleton();

    private SimpleSingleton(){
        System.out.println("初始化。。。");
    }

    public static SimpleSingleton getInstance(){
        return simpleSingleton;
    }

    public void showMessage(){
        System.out.println("singleton hello world");
    }
}
