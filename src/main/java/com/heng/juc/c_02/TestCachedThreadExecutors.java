package com.heng.juc.c_02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 一个线程的线程池有什么用？
 * 保持任务执行的顺序行
 */
public class TestCachedThreadExecutors {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 1000000; i++) {
            int finalI = i;
            executorService.execute(() -> {
                try {
                    TimeUnit.MICROSECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(finalI + "----" + Thread.currentThread().getName());
            });

            System.out.println("已添加到队列: " + finalI);
        }
        long end = System.currentTimeMillis();
        executorService.shutdown();
        System.out.println("执行时间：" + (end - start));

    }
}
