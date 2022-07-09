package com.heng.juc.c_01;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * 当有多少个线程的时候，开始执行操作
 */
public class TestCyclicBarrier {

    public CyclicBarrier cyclicBarrier = new CyclicBarrier(30, () -> System.out.println("票卖完了"));

    public void saleTicket(int num) {
        for (int i = 0; i < num; i++) {
            new Thread(() -> {
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (BrokenBarrierException e) {
                    throw new RuntimeException(e);
                }
            }).start();
        }
    }

    public static void main(String[] args) {
        TestCyclicBarrier testCyclicBarrier = new TestCyclicBarrier();
        testCyclicBarrier.saleTicket(100);
    }
}
