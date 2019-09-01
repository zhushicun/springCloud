package com.shawn.desigener.desigenernew.singleton;

import com.google.common.hash.HashCode;
/**
* @Description:    
* @Author:         hasee
* @CreateDate:     2019/7/20 16:17
* @UpdateUser:     shawn
* @UpdateDate:     2019/7/20 16:17
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class Test {
    public static void main(String[] args) {
        /*System.out.println(Weekday.ERROR_REFUSE.getMessage());
        System.out.println(Weekday.ERROR_REFUSE.getCode());*/
        //简单的单例模式测试
       /* SimpleSingleton simpleSingleton = SimpleSingleton.getInstance();
        SimpleSingleton simpleSingleton2 = SimpleSingleton.getInstance();
        simpleSingleton.showMessage();
        simpleSingleton2.showMessage();
        String s="hello world";*/
       //简单的懒汉单例模式测试
        /*LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
        LazySimpleSingleton instance1 = LazySimpleSingleton.getInstance();
        instance.showMessage();
        instance1.showMessage();*/
        //线程安全的懒汉单例模式测试
        /*LazyLockSingleton lazyLockSingleton=LazyLockSingleton.getInstance();
        LazyLockSingleton lazyLockSingleton1=LazyLockSingleton.getInstance();
        lazyLockSingleton.showMessage();
        lazyLockSingleton1.showMessage();*/
        /**双重线程安全的懒汉单例模式测试*/
        /*DoubleLockSingleton doubleLockSingleton = DoubleLockSingleton.getInstance();
        DoubleLockSingleton doubleLockSingleton1 = DoubleLockSingleton.getInstance();
        doubleLockSingleton.showMessage();
        doubleLockSingleton1.showMessage();*/
        /**利用内部静态类以及类加载的机制进行初始化对象*/
        /*StaticSingleton staticSingleton = StaticSingleton.getInstance();
        StaticSingleton staticSingleton2 = StaticSingleton.getInstance();
        staticSingleton.showMessage();
        staticSingleton2.showMessage();*/
        /*EnumSingleton enumSingleton = EnumSingleton.SHAWN;
        EnumSingleton enumSingleton1 = EnumSingleton.SHAWN;
        System.out.println(enumSingleton.getId());
        System.out.println(enumSingleton1.getId());*/
    }
}
