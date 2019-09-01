package com.shawn.desigener.proxy.myImpl;

import com.shawn.desigener.proxy.MyInterface.Subject;

public class RealSubject implements Subject {
    @Override
    public int sellBooks() {
        System.out.println("卖书");
        return 1 ;
    }

    @Override
    public String speak() {
        System.out.println("说话");
        return "张三";
    }
}