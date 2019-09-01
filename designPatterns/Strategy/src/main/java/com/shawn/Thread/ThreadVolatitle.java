package com.shawn.Thread;

class VolatitleTest extends Thread{

    public volatile Boolean flag=true;
    @Override
    public void run() {
        System.out.println("线程开始");
        while(flag){

        }
        System.out.println("线程结束");
    }

    public void setFlag(Boolean flag){
        this.flag=flag;
    }
}
public class ThreadVolatitle {

    public static void main(String[] args) {
        VolatitleTest volatitleTest = new VolatitleTest();
        volatitleTest.start();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        volatitleTest.setFlag(false);
        System.out.println("flag已经修改");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
