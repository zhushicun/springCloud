package com.shawn.desigener.test;

public class TestPojo implements Test {
    @Override
    public void A() {
        System.out.println("this is A method");
    }

    @Override
    public void B() {
        System.out.println("this is B method");
    }

    //这是非常错误的写法 因为父类引用不到子类的这个方法
    public void C(){
        System.out.println("this is C method");
    }
}
