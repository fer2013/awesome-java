package com.heng.juc.c_01;

public class TestSynThis {

    private int num = 100;

    public void startButton() {
        synchronized (this) {
            num--;
            System.out.println(Thread.currentThread().getName() + " num=" + num);
        }
    }

    public static void main(String[] args) {
        final TestSynThis testSyn = new TestSynThis();

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
