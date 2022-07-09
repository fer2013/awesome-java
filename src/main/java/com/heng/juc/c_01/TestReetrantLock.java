package com.heng.juc.c_01;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 测试重入锁
 */
public class TestReetrantLock {

    Lock lock = new ReentrantLock();

    public void printMessage01() {
        lock.lock();
        System.out.println("test001");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("test001 end.....");
        lock.unlock();
    }

    public void printMessage02() {
        lock.lock();
        System.out.println("test002");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();

        }
        System.out.println("test002 end.....");
    }


    public static void main(String[] args) {
        TestReetrantLock testReetrantLock = new TestReetrantLock();
        new Thread(testReetrantLock::printMessage01).start();
        new Thread(testReetrantLock::printMessage02).start();

    }
}
