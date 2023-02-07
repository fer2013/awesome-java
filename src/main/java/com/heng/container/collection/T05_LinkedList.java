package com.heng.container.collection;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * LinkedList 基于双向链表实现，只能顺序访问，但是可以快速地在链表中间插入和删除元素。
 * 不仅如此，LinkedList 还可以用作栈、队列和双向队列。
 *
 * @author lijiheng
 * @date 2023年02月04日
 */
public class T05_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        System.out.println(list);
        System.out.println(list.get(1));

    }
}
