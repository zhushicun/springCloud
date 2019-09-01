package com.shawn.Thread;

/*
给线程添加局部变量，该变量不共享
web访问的session就是存储在ThreadLocal中
还有数据库连接也有涉及
 */

class Red{
    public static ThreadLocal<Integer> integerThreadLocal = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    public Integer count(){
        int count=integerThreadLocal.get()+1;
        integerThreadLocal.set(count);
        return count;
    }
}
public class ThreadLocalTest extends Thread{
    private Red red;

    public  ThreadLocalTest(Red red){
        this.red=red;
    }

    @Override
    public void run() {

        for (int i = 0; i <3 ; i++) {
            int j=red.count();
            System.out.println(j);
        }
    }


    public static void main(String[] args) {
        Red red = new Red();
        ThreadLocalTest threadLocalTest01 = new ThreadLocalTest(red);
        ThreadLocalTest threadLocalTest02 = new ThreadLocalTest(red);
        threadLocalTest01.start();
        threadLocalTest02.start();
    }
}
