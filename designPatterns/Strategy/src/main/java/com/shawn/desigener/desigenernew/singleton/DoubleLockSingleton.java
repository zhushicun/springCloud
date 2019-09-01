package com.shawn.desigener.desigenernew.singleton;

/**
* @Description:    双重加锁线程安全懒汉单例模式
 * 因为锁的代码块在初始化那块，提高了效率
* @Author:         shawn
* @CreateDate:     2019/7/20 13:09
* @UpdateUser:     yc
* @UpdateDate:     2019/7/20 13:09
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class DoubleLockSingleton extends AbstractSingleton{
    private static DoubleLockSingleton doubleLockSingleton;
    private DoubleLockSingleton(){
        System.out.println("DoubleLockSingleton init...");
    }

    public static DoubleLockSingleton getInstance(){
        if(doubleLockSingleton==null){
            synchronized (DoubleLockSingleton.class){
                if(doubleLockSingleton==null) {
                    doubleLockSingleton = new DoubleLockSingleton();
                }
            }
        }
        return doubleLockSingleton;
    }
}
