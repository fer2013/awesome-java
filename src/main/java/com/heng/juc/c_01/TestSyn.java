package com.heng.juc.c_01;

/**
 * 测试同步对象
 */
public class TestSyn {

    private int num = 100;

    private Object obj = new Object();

    public void startButton() {
        synchronized (obj) {
            num--;
            System.out.println(Thread.currentThread().getName() + " num=" + num);
        }
    }

    public static void main(String[] args) {
        final TestSyn testSyn = new TestSyn();

        new Thread(new Runnable() {
            @Override
            public void run() {
                testSyn.startButton();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                testSyn.startButton();
            }
        }).start();

    }
}
