package com.heng.container.collection;

import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet 基于红黑树实现，支持有序性操作，例如根据一个范围查找元素的操作。
 * 但是查找效率不如 HashSet，HashSet 查找的时间复杂度为 O(1)，TreeSet 则为 O(logN)。
 *
 * @author lijiheng
 * @date 2023年02月04日
 */
public class T01_TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(2);
        set.add(1);
        set.add(3);
        System.out.println(set);
        Set<String> setStr = new TreeSet<>();

        setStr.add("你好");
        setStr.add("我的");
        setStr.add("北京");
        System.out.println(setStr);

    }
}
