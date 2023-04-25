package com.heng.test;

/**
 * 面试：最终返回多少
 * @author heng
 * @date 2023年04月24日16:21
 */
public class TestTryReturn {
    public static void main(String[] args) {

        int num = extracted();
        System.out.println("num: " + num);
    }

    private static int extracted() {
        try {
            int num =1/0;
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        } finally {
            return 1;
        }
    }
}
