package com.shawn.desigener.desigenernew.singleton;
/*
简单的懒汉单例模式
线程不安全，因为没有加锁
 */
public class LazySimpleSingleton {
    private static LazySimpleSingleton lazySimpleSingleton;
    private LazySimpleSingleton(){
        System.out.println("初始化");
    }

    public static LazySimpleSingleton getInstance(){
        if(lazySimpleSingleton==null){
            lazySimpleSingleton=new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
    public void showMessage(){
        System.out.println("lazy simple singleton");
    }
}
