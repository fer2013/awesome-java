package com.heng.juc.c_01;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class TestCountDownLatch {

    public CountDownLatch latch = new CountDownLatch(100);


    public void runInfo() {
        latch.countDown();
        System.out.println(Thread.currentThread().getName() + " is running.....");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {

        }
    }

    public static void main(String[] args) {
        TestCountDownLatch testCountDownLatch = new TestCountDownLatch();
        for (int i = 0; i < 100; i++) {
            new Thread(testCountDownLatch::runInfo).start();
        }

        try {
            //等待所有线程都执行完，再往下执行
            testCountDownLatch.latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}
