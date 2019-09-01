package com.shawn.desigener.desigenernew.Observer;

/**
* @Description:    观察者模式，jdk中有实现，但是往往需要我们自己写个
 * 优点1、观察者和被观察者是抽象耦合的。 2、建立一套触发机制
 * 缺点： 1、如果一个被观察者对象有很多的直接和间接的观察者的话，
 * 将所有的观察者都通知到会花费很多时间。
 * 2、如果在观察者和观察目标之间有循环依赖的话，观察目标会触发它们之间进行循环调用，
 * 可能导致系统崩溃。
 * 3、观察者模式没有相应的机制让观察者知道所观察的目标对象是怎么发生变化的，
 * 而仅仅只是知道观察目标发生了变化。
 * 注意事项：
 * 1、JAVA 中已经有了对观察者模式的支持类。
 * 2、避免循环引用。 
 * 3、如果顺序执行，某一观察者错误会导致系统卡壳，一般采用异步方式。
* @Author:         hasee
* @CreateDate:     2019/8/20 15:42
* @UpdateUser:     shawn
* @UpdateDate:     2019/8/20 15:42
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class Test {
    public static void main(String[] args) {
        Subject subject = new Subject();
        /** 创建观察者并且绑定到非观察者*/
        Observer observer = new TreeObserver(subject);
        Observer fireObserver = new FireObserver(subject);
        System.out.println("First change");
        subject.setState("001");
        System.out.println("Second change");
        subject.setState("007");
    }
}
