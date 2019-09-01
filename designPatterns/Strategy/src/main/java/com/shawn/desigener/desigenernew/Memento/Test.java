package com.shawn.desigener.desigenernew.Memento;


/**
* @Description:    备忘录模式 保存一个对象的某个状态，以便在适当的时候恢复对象。备忘录模式属于行为型模式。
 *  应用实例：1、后悔药。 2、打游戏时的存档。 3、Windows 里的 ctri + z。 4、IE 中的后退。 4、数据库的事务管理。
 *   使用场景：1、需要保存/恢复数据的相关状态场景。 2、提供一个可回滚的操作。
 *注意事项： 1、为了符合迪米特原则，还要增加一个管理备忘录的类。 2、为了节约内存，可使用原型模式+备忘录模式。
* @Author:         hasee
* @CreateDate:     2019/8/20 14:57
* @UpdateUser:     shawn
* @UpdateDate:     2019/8/20 14:57
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class Test {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("1");
        originator.setState("2");
        /**存入备忘录第一个状态*/
        careTaker.addMemento(originator.savetoMemento());
        originator.setState("3");
        /** 存入备忘录的第二个状态*/
        careTaker.addMemento(originator.savetoMemento());
        originator.setState("4");
        System.out.println("当前状态码是："+originator.getState());
        originator.getStateFromMemento(careTaker.getMenmento(0));
        System.out.println("第一次状态码是："+originator.getState());
        originator.getStateFromMemento(careTaker.getMenmento(1));
        System.out.println("第二次状态码是："+originator.getState());

    }
}
