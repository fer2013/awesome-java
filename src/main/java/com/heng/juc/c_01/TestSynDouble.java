package com.heng.juc.c_01;

/**
 * synchronized 为可重入锁
 *
 * @author heng
 * @date 2022年07月02日
 */
public class TestSynDouble {
    public synchronized void run_01() {
        this.run_02();
        System.out.println("this is run_01 method");
    }

    public synchronized void run_02() {
        System.out.println("This is run_02 method");
    }

    public static void main(String[] args) {

        new TestSynDouble().run_01();
    }
}
