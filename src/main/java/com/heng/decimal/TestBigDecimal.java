package com.heng.decimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TestBigDecimal {


    public static void main(String[] args) {
        System.out.println("---------------加-----------------");
        //1.加
        testAdd();
        System.out.println("---------------减-----------------");
        //2.减
        testSubtract();
        System.out.println("---------------乘-----------------");
        //3.乘
        testMultiply();
        System.out.println("---------------除-----------------");
        //4.除
        testDivide();
    }

    /**
     * <P>加</P>
     * 可以看到，使用double类型初始化BigDecimal 对象，进行加法运算时就出现了精度问题。
     * 并不是所有的浮点数都能够在二进制系统中被精确的表示，自然而然的在进行加减乘除运算时就会出错。
     */
    public static void testAdd() {
        //用double类型初始化BigDecimal对象
        BigDecimal numA = new BigDecimal(0.05);
        BigDecimal numB = new BigDecimal(0.06);
        System.out.println("numA + numB = " + numA.add(numB));
        //用double类型和int类型初始化BigDecimal对象。（作加法运算时得到的只是一个近似值）
        BigDecimal numC = new BigDecimal(3.05);
        BigDecimal numD = new BigDecimal(100);
        System.out.println("numC + numD = " + numC.add(numD));
        //用字符串类型初始化BigDecimal对象。（作加法运算时得到的是精确值）
        BigDecimal strA = new BigDecimal("3.05");
        BigDecimal strB = new BigDecimal("100");
        System.out.println("strA + strB = " + strA.add(strB));
    }

    /**
     * <P>减</P>
     */
    public static void testSubtract() {
        //用double类型初始化BigDecimal对象
        BigDecimal numA = new BigDecimal(0.05);
        BigDecimal numB = new BigDecimal(0.06);
        System.out.println("numA - numB = " + numA.subtract(numB));
        //用double类型和int类型初始化BigDecimal对象。（作减法运算时得到的只是一个近似值）
        BigDecimal numC = new BigDecimal(100);
        BigDecimal numD = new BigDecimal(0.05);
        System.out.println("numC - numD = " + numC.subtract(numD));
        //用字符串类型初始化BigDecimal对象。（作减法运算时得到的是精确值）
        BigDecimal strA = new BigDecimal("100");
        BigDecimal strB = new BigDecimal("0.05");
        System.out.println("strA - strB = " + strA.subtract(strB));
    }

    /**
     * <P>乘</P>
     */
    public static void testMultiply() {
        //用double类型初始化BigDecimal对象
        BigDecimal numA = new BigDecimal(0.05);
        BigDecimal numB = new BigDecimal(0.06);
        System.out.println("numA * numB = " + numA.multiply(numB));
        //用double类型和int类型初始化BigDecimal对象。（作乘法运算时得到的只是一个近似值）
        BigDecimal numC = new BigDecimal(100);
        BigDecimal numD = new BigDecimal(0.05);
        System.out.println("numC * numD = " + numC.multiply(numD));
        //用字符串类型初始化BigDecimal对象。（作乘法运算时得到的是精确值）
        BigDecimal strA = new BigDecimal("100");
        BigDecimal strB = new BigDecimal("0.05");
        System.out.println("strA * strB = " + strA.multiply(strB));
    }

    /**
     * <P>除</P>
     */
    public static void testDivide() {
        BigDecimal numA = new BigDecimal("1");
        BigDecimal numB = new BigDecimal("-1");
        BigDecimal numC = new BigDecimal("3");
        // 保留两位小数，舍入模式为UP
        System.out.println("1/3保留两位小数（UP） = " + numA.divide(numC, 2, RoundingMode.UP));
        System.out.println("-1/3保留两位小数（UP） = " + numB.divide(numC, 2, RoundingMode.UP));
        // 保留两位小数，舍入模式为DOWN
        System.out.println("1/3保留两位小数（DOWN） = " + numA.divide(numC, 2, RoundingMode.DOWN));
        System.out.println("-1/3保留两位小数（DOWN） = " + numB.divide(numC, 2, RoundingMode.DOWN));
        // 保留两位小数，舍入模式为CEILING
        System.out.println("1/3保留两位小数（CEILING） = " + numA.divide(numC, 2, RoundingMode.CEILING));
        System.out.println("-1/3保留两位小数（CEILING） = " + numB.divide(numC, 2, RoundingMode.CEILING));
        // 保留两位小数，舍入模式为FLOOR
        System.out.println("1/3保留两位小数（FLOOR） = " + numA.divide(numC, 2, RoundingMode.FLOOR));
        System.out.println("-1/3保留两位小数（FLOOR） = " + numB.divide(numC, 2, RoundingMode.FLOOR));

        BigDecimal numD = new BigDecimal("1");
        BigDecimal numE = new BigDecimal("-1");
        BigDecimal numF = new BigDecimal("8");
        // 保留两位小数，舍入模式为HALF_UP
        System.out.println("1/8(=0.125)保留两位小数（HALF_UP） = " + numD.divide(numF, 2, RoundingMode.HALF_UP));
        System.out.println("-1/8(=0.125)保留两位小数（HALF_UP） = " + numE.divide(numF, 2, RoundingMode.HALF_UP));
        // 保留两位小数，舍入模式为HALF_DOWN
        System.out.println("1/8(=0.125)保留两位小数（HALF_DOWN） = " + numD.divide(numF, 2, RoundingMode.HALF_DOWN));
        System.out.println("-1/8(=0.125)保留两位小数（HALF_DOWN） = " + numE.divide(numF, 2, RoundingMode.HALF_DOWN));

        // 保留两位小数，舍入模式为HALF_EVEN
        System.out.println("0.54/4(=0.135)保留两位小数（HALF_EVEN） = " + new BigDecimal("0.54").divide(new BigDecimal("4"), 2, RoundingMode.HALF_EVEN));
        System.out.println("1/8(=0.125)保留两位小数（HALF_EVEN） = " + numE.divide(numF, 2, RoundingMode.HALF_EVEN));

        //UNNECESSARY,会报异常
        System.out.println("1/8(=0.125) = " + numE.divide(numF, RoundingMode.UNNECESSARY));
    }
}
