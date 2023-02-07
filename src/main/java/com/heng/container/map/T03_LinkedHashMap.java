package com.heng.container.map;

import java.util.LinkedHashMap;


/**
 * 使用双向链表来维护元素的顺序，顺序为插入顺序或者最近最少使用(LRU)顺序
 *
 * @author lijiheng
 * @date 2023年02月04日
 */
public class T03_LinkedHashMap {

    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();

        map.put("key2", "value2");
        map.put("key1", "value1");
        map.put("key3", "value3");
        System.out.println(map);
    }
}
