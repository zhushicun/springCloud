package com.shawn.desigener.desigenernew.Interpreter;

public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpert(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
