package com.shawn.desigener.desigenernew.Strategy;

/**
* @Description:    策略模式 一个类的行为或其算法可以在运行时更改
 * 意图：定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。
 * 主要解决：在有多种算法相似的情况下，使用 if...else 所带来的复杂和难以维护。
 * 优点： 1、算法可以自由切换。 2、避免使用多重条件判断。 3、扩展性良好。
 * 缺点： 1、策略类会增多。 2、所有策略类都需要对外暴露。
 * 注意事项：如果一个系统的策略多于四个，就需要考虑使用混合模式，解决策略类膨胀的问题。
* @Author:         hasee
* @CreateDate:     2019/8/21 9:59
* @UpdateUser:     shawn
* @UpdateDate:     2019/8/21 9:59
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new OperationAdd());
        System.out.println(context.executeStrategy(2,3));
        context.setStrategy(new OperationMultiply());
        System.out.println(context.executeStrategy(2,3));
        context.setStrategy(new OperationSubstract());
        System.out.println(context.executeStrategy(2,3));
    }
}
