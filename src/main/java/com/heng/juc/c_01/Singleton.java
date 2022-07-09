package com.heng.juc.c_01;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Singleton {

    private static Object object = null;


    public static Object getInstance() {
        if (object == null) {
            synchronized (Singleton.class) {
                if (object == null) {
                    object = new Object();
                }
            }
        }
        return object;
    }

    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();


        for (int i = 0; i < 100000; i++) {
            new Thread(() -> {
//                System.out.println(Singleton.getInstance().hashCode());
                hashSet.add(Singleton.getInstance().hashCode());
            }).start();
        }
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(hashSet.size());
    }
}
