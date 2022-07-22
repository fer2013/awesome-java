package com.heng.test;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

    /**
     * String拼接100万字符串耗时测试
     */
    public static void stringAppendTest() {
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 300_0000; i++) {
            str += "I'm here";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String拼接300万字符串耗时为" + (endTime - startTime) + "毫秒");

    }

    public static void removeValue() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        System.out.println(list);
        list.remove("b");
        System.out.println(list);
    }

    public static void main(String[] args) {
//        Test01.stringAppendTest();
//        Terminatorst01.removeValue();
//        Integer [] array = new Integer[10];
//        array[0] = 0;
//        array[1] = 0;
//        array[2] = 0;
//        array[3] = 0;
//        System.out.println(array);

//        final int newSize = 0;
//        if(true){
//            newSize = 2;
//        }
//        System.out.println(newSize);

    }
}
