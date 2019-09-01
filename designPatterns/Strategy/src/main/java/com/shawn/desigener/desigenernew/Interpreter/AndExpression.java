package com.shawn.desigener.desigenernew.Interpreter;

public class AndExpression implements Expression {
    private Expression ex1;
    private Expression ex2;

    public AndExpression(Expression ex1, Expression ex2) {
        this.ex1 = ex1;
        this.ex2 = ex2;
    }

    @Override
    public boolean interpert(String context) {
        return ex1.interpert(context)&&ex2.interpert(context);
    }
}
