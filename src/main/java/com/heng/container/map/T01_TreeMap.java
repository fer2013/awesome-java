package com.heng.container.map;

import java.util.TreeMap;


/**
 * 基于红黑树实现。
 *
 * @author lijiheng
 * @date 2023年02月04日
 */
public class T01_TreeMap {

    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();

        map.put("key2", "value2");
        map.put("key1", "value1");
        map.put("key3", "value3");
        System.out.println(map);
    }
}
