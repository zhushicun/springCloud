package com.shawn.desigener.desigenernew.State;

public class StartState implements State {
    @Override
    public void doAction(Context content) {
        System.out.println("Player is in start");
        content.setState(this);
    }

    @Override
    public String toString(){
        return "Start state";
    }
}
