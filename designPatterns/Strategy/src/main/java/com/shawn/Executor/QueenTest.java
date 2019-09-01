package com.shawn.Executor;

import java.util.concurrent.ConcurrentLinkedQueue;

public class QueenTest {

    //非阻塞队列
    public static void main(String[] args) {

        ConcurrentLinkedQueue<String> stringConcurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        stringConcurrentLinkedQueue.add("1");
        stringConcurrentLinkedQueue.offer("2");
        stringConcurrentLinkedQueue.offer("3");
        stringConcurrentLinkedQueue.poll();//取完队列移除元素，队列里面空则取出为null
        System.out.println(stringConcurrentLinkedQueue.size());
        stringConcurrentLinkedQueue.peek();//取完队列不移除元素
        System.out.println(stringConcurrentLinkedQueue.size());
    }
}
