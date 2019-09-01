package com.shawn.Executor;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class ProductThread implements Runnable{
    private BlockingQueue<String> blockingQueue;
    private volatile Boolean flag =true;
    AtomicInteger atomicInteger=new AtomicInteger();

    public ProductThread(BlockingQueue<String> blockingQueue){
        this.blockingQueue=blockingQueue;
    }
    @Override
    public void run() {

        System.out.println("生产者线程已经启动#####");
        while (flag){
            String data = atomicInteger.incrementAndGet()+"";
            try {
                Thread.sleep(1000);
                boolean offer = blockingQueue.offer(data, 1, TimeUnit.SECONDS);
                if(offer){
                    System.out.println("存入队列成功#####"+data);
                }else{
                    System.out.println("存入队列失败#####");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}


class ConsumerThread implements Runnable{
    private BlockingQueue<String> blockingQueue;
    private volatile Boolean flag =true;

    public ConsumerThread(BlockingQueue<String> blockingQueue){
        this.blockingQueue=blockingQueue;
    }
    @Override
    public void run() {

        System.out.println("消费者线程已经启动#####");
        while (flag){
            try {
                String poll = blockingQueue.poll(2, TimeUnit.SECONDS);
                if(poll==null){
                    System.out.println("获取队列失败#####");
                    flag=false;
                    return;
                }
                System.out.println("获取队列成功#####"+poll);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
public class QueenPandC {
    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue = new LinkedBlockingDeque<>();
        ProductThread productThread = new ProductThread(blockingQueue);
        ConsumerThread consumerThread = new ConsumerThread(blockingQueue);
        Thread thread = new Thread(productThread);
        Thread thread1 = new Thread(consumerThread);
        thread.start();
        thread1.start();
        try {
            Thread.sleep(1000*10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.stop();
    }
}
