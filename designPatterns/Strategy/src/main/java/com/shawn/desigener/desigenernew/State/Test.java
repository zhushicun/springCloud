package com.shawn.desigener.desigenernew.State;


/**
* @Description:    状态模式 类的行为是基于它的状态改变的。这种类型的设计模式属于行为型模式。
 *状态模式和命令模式一样，也可以用于消除 if...else 等条件选择语句。
 * 应用实例： 1、打篮球的时候运动员可以有正常状态、不正常状态和超常状态。 2、曾侯乙编钟中，'钟是抽象接口','钟A'等是具体状态，'曾侯乙编钟'是具体环境（Context）。
 * 使用场景： 1、行为随状态改变而改变的场景。 2、条件、分支语句的代替者。
 *
 * 注意事项：在行为受状态约束的时候使用状态模式，而且状态不超过 5 个。
* @Author:         hasee
* @CreateDate:     2019/8/20 20:03
* @UpdateUser:     shawn
* @UpdateDate:     2019/8/20 20:03
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        StartState startState =new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());
        StopState stopState =new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
