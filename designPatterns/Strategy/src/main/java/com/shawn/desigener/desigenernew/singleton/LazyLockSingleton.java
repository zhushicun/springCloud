package com.shawn.desigener.desigenernew.singleton;
/*
* 枷锁的懒汉单例模式
* 线程安全
* 效率过低
* */
public class LazyLockSingleton extends AbstractSingleton{
    private static LazyLockSingleton lazyLockSingleton;
    private LazyLockSingleton(){
        System.out.println("Lazy lock Singleton");
    }

    public static synchronized LazyLockSingleton getInstance(){
        if(lazyLockSingleton==null){
            lazyLockSingleton=new LazyLockSingleton();
        }
        return lazyLockSingleton;
    }

}
