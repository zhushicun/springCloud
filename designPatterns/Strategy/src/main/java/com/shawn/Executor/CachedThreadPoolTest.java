package com.shawn.Executor;

import java.util.concurrent.*;

public class CachedThreadPoolTest {
    public static void main(String[] args) {
        CachedThreadPoolTest cachedThreadPoolTest = new CachedThreadPoolTest();
        cachedThreadPoolTest.test4();
    }


    public  void test1(){
        ExecutorService executorService = Executors.newCachedThreadPool();
        common(executorService);
    }


    public  void test2(){
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        common(executorService);
    }

    public  void test3(){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        common(executorService);
    }

    public void test4(){
        ExecutorService executorService = Executors.newScheduledThreadPool(3);
        common(executorService);
    }


    public void common(ExecutorService executorService){
        for (int i = 0; i <10 ; i++) {
            final int temp=i;
            if(executorService instanceof ScheduledExecutorService){
                ((ScheduledExecutorService) executorService).schedule(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(Thread.currentThread().getName()+":"+temp);
                    }
                },3, TimeUnit.SECONDS);
            }else{
                executorService.execute(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(Thread.currentThread().getName()+":"+temp);
                    }
                });
            }


        }
        executorService.shutdown();
    }


}
