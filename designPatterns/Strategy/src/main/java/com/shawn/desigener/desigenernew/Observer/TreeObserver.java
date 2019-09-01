package com.shawn.desigener.desigenernew.Observer;

public class TreeObserver extends Observer {
    public TreeObserver(Subject subject) {
        this.subject=subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Tree :"+subject.getState());
    }
}
