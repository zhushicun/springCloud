package com.shawn.desigener.desigenernew.Mediator;

/**
* @Description:中介者模式，将多个对象之间的网状结构转换为星型结构
 * 1、降低了类的复杂度，将一对多转化成了一对一。 2、各个类之间的解耦。 3、符合迪米特原则。
 *  1、中国加入 WTO 之前是各个国家相互贸易，结构复杂，现在是各个国家通过 WTO 来互相贸易。
 *  2、机场调度系统。 3、MVC 框架，其中C（控制器）就是 M（模型）和 V（视图）的中介者。
* @Author:         hasee
* @CreateDate:     2019/8/20 14:09
* @UpdateUser:     shawn
* @UpdateDate:     2019/8/20 14:09
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class Test {
    public static void main(String[] args) {
        User user = new User("AAA");
        User user1=new User("BBB");
        user.sendMessage("000000");
        user1.sendMessage("11111111");

    }
}
