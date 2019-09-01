package com.shawn.desigener.desigenernew.Bridge;

/**
* @Description:    桥接模式{用于多重变化，完全可以理解为两个维度xy，x轴是继承维度，子类可能在继承上添加自己的属性和方法
 * },y轴是接口维度，通过在抽象类中定义接口，在实例化对象的时候，你可以选择自己需要实现的接口。在新增变化的时候，只要自己添加相应的功能就行
 *
 *
 * 父类在引用子类对象的时候，永远只能调用自己本身已经定义的方法。
* @Author:         hasee
* @CreateDate:     2019/8/14 16:51
* @UpdateUser:     shawn
* @UpdateDate:     2019/8/14 16:51
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class Test {
    public static void main(String[] args) {
        BaseShap yellowShap = new Circle(new DrawYeallow(),1,1,1);
        BaseShap greenShap = new Circle(new DrawGreen(),2,2,2);
        yellowShap.drawShap();
        greenShap.drawShap();
    }
}
