package com.heng.test;

import java.math.BigDecimal;

public class BigdecimalTest {

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(100);
        BigDecimal b = new BigDecimal(200);

        System.out.println(a.compareTo(b));
    }
}
