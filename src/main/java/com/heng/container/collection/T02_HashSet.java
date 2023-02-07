package com.heng.container.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * HashSet 基于哈希表实现，支持快速查找，但不支持有序性操作。
 * 并且失去了元素的插入顺序信息，也就是说使用 Iterator 遍历 HashSet 得到的结果是不确定的。
 *
 * @author lijiheng
 * @date 2023年02月04日
 */
public class T02_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(1);
        set.add(3);
        System.out.println(set);
        Set<String> setStr = new HashSet<>();

        setStr.add("你好");
        setStr.add("我的");
        setStr.add("北京");
        System.out.println(setStr);

    }
}
