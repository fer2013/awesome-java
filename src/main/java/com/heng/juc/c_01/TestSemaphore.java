package com.heng.juc.c_01;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class TestSemaphore {
    private Semaphore semaphore = new Semaphore(2, false);

    public void run01() {
        try {
            semaphore.acquire();
            TimeUnit.SECONDS.sleep(1);
            System.out.println("run_01......");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    public void run02() {
        try {
            semaphore.acquire();
            TimeUnit.SECONDS.sleep(1);
            System.out.println("run_02......");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
    }

    public static void main(String[] args) {
        TestSemaphore testSemaphore = new TestSemaphore();

        for (int i = 0; i < 10; i++) {
            new Thread(testSemaphore::run01).start();
        }
        for (int i = 0; i < 10; i++) {
            new Thread(testSemaphore::run02).start();
        }

    }
}
