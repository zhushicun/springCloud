package com.shawn.desigener.desigenernew.Observer;

public class FireObserver extends Observer {
    public FireObserver(Subject subject) {
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Fire :"+subject.getState());
    }
}
