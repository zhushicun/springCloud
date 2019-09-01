package com.shawn.desigener.desigenernew.State;

public class StopState implements State{
    @Override
    public void doAction(Context content) {
        System.out.println("Player is in stop");
        content.setState(this);
    }

    @Override
    public String toString(){
        return "Start state";
    }
}
