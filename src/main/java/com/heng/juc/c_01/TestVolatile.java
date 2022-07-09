package com.heng.juc.c_01;

import java.util.ArrayList;
import java.util.List;

public class TestVolatile {

    volatile int  num = 0;

    public synchronized void plus() {
        for (int i = 0; i < 1000000000; i++) {
            num++;
        }
    }

    public static void main(String[] args) {
        TestVolatile test = new TestVolatile();

        //创建线程列表
        List<Thread> threadList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            threadList.add(new Thread(test::plus, "T-" + i));
        }
        //循环启动线程
        threadList.forEach(thread -> thread.start());
        threadList.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        System.out.println("num  = " + test.num);
    }


}
