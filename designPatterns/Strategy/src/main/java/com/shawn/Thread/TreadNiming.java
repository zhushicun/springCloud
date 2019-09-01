package com.shawn.Thread;

/*
join方法
 */
public class TreadNiming {
    public static void main(String[] args) {

        ThreadInterface ti=new ThreadInterface();
        Thread t0 = new Thread(ti);
        t0.start();
        try {
            t0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {

                    try {
                        Thread.sleep(100);
                        System.out.println("子线程打印：i:"+i);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        //设置该线程为守护线程
        t1.setDaemon(true);
        t1.start();
        try {
            //让子线程先走完
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i <20 ; i++) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("主线程打印，i:"+i);
        }
        System.out.println("主线程结束");

    }
}
