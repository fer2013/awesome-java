package com.heng.container.map;

import java.util.HashMap;


/**
 * 1.7基于哈希表实现，1.8基于数组+链表+红黑树。
 *
 * @author lijiheng
 * @date 2023年02月04日
 */
public class T02_HashMap {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("key2", "value2");
        map.put("key1", "value1");
        map.put("key3", "value3");
        System.out.println(map);
    }
}
