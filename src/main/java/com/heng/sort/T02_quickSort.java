package com.heng.sort;

/**
 * 快速排序
 *
 * @author lijiheng
 * @date 2023年02月09日
 */
public class T02_quickSort {

    public static void main(String[] args) {
        int[] data = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.err.println("排序之前:\n" + java.util.Arrays.toString(data));
        quickSort(data, 0, data.length - 1);
        System.err.println("排序之后:\n" + java.util.Arrays.toString(data));
    }

    /**
     * 使用分治法来把一个串(list)分为两个子串(sub-lists)。具体算法描述如下:
     * ⚫ 从数列中挑出一个元素，称为 “基准”(pivot);
     * ⚫ 重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面(相同的数可
     *    以到任一边)。在这个分区退出之后，该基准就处于数列的中间位置。这个称为分区(partition)操作;
     * ⚫ 递归地(recursive)把小于基准值元素的子数列和大于基准值元素的子数列排序。
     *
     * @param data
     * @param low
     * @param high
     */
    public static void quickSort(int[] data, int low, int high) {
        int i, j, temp, t;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        //temp 就是基准位
        temp = data[low];
        System.out.println("基准位:" + temp);

        while (i < j) {
            //先看右边，依次往左递减
            while (temp <= data[j] && i < j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp >= data[i] && i < j) {
                i++;
            }
            //如果满足条件则交换
            if (i < j) {
                System.out.println("交换:" + data[i] + "和" + data[j]);
                t = data[j];
                data[j] = data[i];
                data[i] = t;
                System.out.println(java.util.Arrays.toString(data));

            }
        }
        //最后将基准位与 i 和 j 相等位置的数字交换
        System.out.println("基准位" + temp + "和 i、j 相遇的位置" + data[i] + "交换");
        data[low] = data[i];


        data[i] = temp;
        System.out.println(java.util.Arrays.toString(data));
        //递归调用左半数组
        quickSort(data, low, j - 1);
        //递归调用右半数组
        quickSort(data, j + 1, high);

    }




}
