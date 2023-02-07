package com.heng.search;

public class T01_BinarySearch {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int index = binarySearch(array, 5);
        System.out.println("--------------------- index: " + index + ",number=" + array[index]);
    }

    /***
     * 二分查找的数
     * @param array
     * @param number
     * @return
     */
    public static int binarySearch(int[] array, int number) {
        int low = 0;
        int height = array.length - 1;
        while (low <= height) {
            // 找出中间下标
            int mid = low + (height - low) / 2;
            System.out.println("mid = " + mid);
            //小于改低位+1，大于改高位-1，等于直接取值
            if (array[mid] < number) {
                low = mid + 1;
            } else if (array[mid] == number) {
                return mid;
            } else {
                height = mid - 1;
            }
        }

        return -1;
    }
}
