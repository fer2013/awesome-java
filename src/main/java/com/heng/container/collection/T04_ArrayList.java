package com.heng.container.collection;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * ArrayList 基于动态数组实现，支持随机访问。
 * <p>
 * ArrayList也采用了快速失败的机制，通过记录modCount参数来实现。
 * 在面对并发的修改时，迭代器很快就会完全失败，而不是冒着在将来某个不确定时间发生任意不确定行为的风险。
 *
 * @author lijiheng
 * @date 2023年02月04日
 */
public class T04_ArrayList {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        Field field = list.getClass().getDeclaredField("elementData");
        field.setAccessible(true);
        int cap = Array.getLength(field.get(list));
        System.out.println("调用ensureCapacity前：" + cap);
        list.ensureCapacity(20);
        field = list.getClass().getDeclaredField("elementData");
        field.setAccessible(true);
        cap = Array.getLength(field.get(list));
        System.out.println("调用ensureCapacity后：" + cap);
        list.add(1);
        list.add(3);
        System.out.println(list);

    }
}
