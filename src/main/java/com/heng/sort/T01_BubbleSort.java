package com.heng.sort;

/**
 * 冒泡排序
 *
 * @author lijiheng
 * @date 2023年02月09日
 */
public class T01_BubbleSort {

    public static void main(String[] args) {
        int[] data = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        System.out.println("排序之前:\n" + java.util.Arrays.toString(data));

        bubbleSort(data);

        System.out.println("排序之后:\n" + java.util.Arrays.toString(data));
    }

    /**
     * @param data 被排序的数组
     */
    public static void bubbleSort(int[] data) {
        int arrayLength = data.length;

        for (int i = 1; i < arrayLength; i++) {//第 i 次排序

            for (int j = 0; j < arrayLength - i; j++) {//从索引为 j 的数开始
                if (data[j] > data[j + 1]) { //相邻元素两两对比
                    int temp = data[j + 1]; // 元素交换
                    data[j + 1] = data[j];
                    data[j] = temp;
                }
            }

            System.err.println("第" + i + "次排序:\n" + java.util.Arrays.toString(data));
        }
    }

}
