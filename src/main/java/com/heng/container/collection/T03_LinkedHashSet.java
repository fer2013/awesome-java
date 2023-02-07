package com.heng.container.collection;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * LinkedHashSet 具有 HashSet 的查找效率，且内部使用双向链表维护元素的插入顺序。
 *
 * @author lijiheng
 * @date 2023年02月04日
 */
public class T03_LinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(2);
        set.add(1);
        set.add(3);
        System.out.println(set);
        Set<String> setStr = new LinkedHashSet<>();

        setStr.add("你好");
        setStr.add("我的");
        setStr.add("北京");
        System.out.println(setStr);

    }
}
