package com.heng.juc.c_01;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestInterrupt {

    Lock lock = new ReentrantLock();

    public void run01() {
        try {
            lock.lockInterruptibly();
            System.out.println("run001");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("run001 end ");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public void run02() {
        try {
            lock.lockInterruptibly();
            System.out.println("run002");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("run002 end ");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }

    }

    public static void main(String[] args) {
        TestInterrupt testInterrupt = new TestInterrupt();
        Thread t1 = new Thread(testInterrupt::run01);
        t1.start();
        Thread t2 = new Thread(testInterrupt::run02);
        t2.start();
        t2.interrupt();


    }


}
