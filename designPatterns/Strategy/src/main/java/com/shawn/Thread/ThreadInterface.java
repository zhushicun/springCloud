package com.shawn.Thread;

public class ThreadInterface implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("接口实现的线程"+i);
        }
    }
}
