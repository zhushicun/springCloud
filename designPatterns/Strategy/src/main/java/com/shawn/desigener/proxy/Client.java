package com.shawn.desigener.proxy;

import com.shawn.desigener.proxy.MyInterface.Subject;
import com.shawn.desigener.proxy.myImpl.RealSubject;
import com.shawn.desigener.proxy.myProxy.MyInvocationHandler;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        //真实对象
        Subject realSubject =  new RealSubject();

        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(realSubject);
        //代理对象
        Subject proxyClass = (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Subject.class}, myInvocationHandler);

        proxyClass.sellBooks();

        proxyClass.speak();
    }
}