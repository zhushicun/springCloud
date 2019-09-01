package com.shawn.desigener.desigenernew.Interpreter;

/**
* @Description:    解释器模式，1、可扩展性比较好，灵活。 2、增加了新的解释表达式的方式。 3、易于实现简单文法。
 *
* @Author:         hasee
* @CreateDate:     2019/8/20 10:49
* @UpdateUser:     shawn
* @UpdateDate:     2019/8/20 10:49
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class Test {
    public static Expression getMealExpress(){
        Expression expression = new TerminalExpression("A");
        Expression expression1 = new TerminalExpression("B");
        Expression expression2 = new AndExpression(expression,expression1);
        return expression2;
    }

    public static Expression getOrExpress(){
        Expression expression = new TerminalExpression("A");
        Expression expression1 = new TerminalExpression("B");
        Expression expression2 = new OrExpression(expression,expression1);
        return expression2;
    }

    public static void main(String[] args) {
        System.out.println(getMealExpress().interpert("A"));
        System.out.println(getOrExpress().interpert("AB"));
    }
}
