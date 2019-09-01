package com.shawn.Executor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;


public class ArrayBlockQueenTest {
    public static void main(String[] args) throws Exception {
        ArrayBlockingQueue<String> stringBlockingDeque=  new ArrayBlockingQueue<String>(3);
        stringBlockingDeque.offer("1");
        stringBlockingDeque.offer("2",2,TimeUnit.SECONDS);
        stringBlockingDeque.offer("3",2,TimeUnit.SECONDS);
        stringBlockingDeque.offer("4",2,TimeUnit.SECONDS);//队列满了才会等待2秒
        System.out.println(stringBlockingDeque.poll());
        System.out.println(stringBlockingDeque.poll());
        System.out.println(stringBlockingDeque.poll(3,TimeUnit.SECONDS));
        System.out.println(stringBlockingDeque.poll(3,TimeUnit.SECONDS));//队列空了才会等待3秒



    }
}
