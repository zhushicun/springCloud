package com.shawn.desigener.desigenernew.singleton;
/**
* @Description:    内部静态类创建相应对象,利用classLoader机制进行用例的初始化
* @Author:         hasee
* @CreateDate:     2019/7/20 16:11
* @UpdateUser:     shawn
* @UpdateDate:     2019/7/20 16:11
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class StaticSingleton extends AbstractSingleton {
    private static class SingletonHolder{
        private static final StaticSingleton staticSingleton=new StaticSingleton();
    }

    private StaticSingleton(){
        System.out.println("StaticSingleton init...");
    }

    public static StaticSingleton getInstance(){
        return SingletonHolder.staticSingleton;
    }
}
