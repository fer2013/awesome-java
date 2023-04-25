package com.heng.juc.c_01;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * CountDownLatch的使用
 *
 * @author heng
 * @date 2023年04月18日22:12
 */
public class TestCountDownLatch {

    public CountDownLatch latch = new CountDownLatch(4);


    public void runInfo() {
        latch.countDown();
        System.out.println(Thread.currentThread().getName() + " is running....." + latch.getCount());
        try {
            TimeUnit.SECONDS.sleep(11);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("----------------------------------------------------------------" + latch.getCount());
        }
    }

    public static void main(String[] args) {
        TestCountDownLatch testCountDownLatch = new TestCountDownLatch();
        for (int i = 0; i < 4; i++) {
            new Thread(testCountDownLatch::runInfo).start();
        }

        try {
            //等待所有线程都执行完，再往下执行
            testCountDownLatch.latch.await(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(" over ....." + testCountDownLatch.latch.getCount());


    }

}
