package com.heng.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author heng
 * @date ${datetime.now()}
 */
public class TestGC {
    public static void main(String[] args) {
        List<TestGC> list = new ArrayList<TestGC>();
        while (true) {
            TestGC gc = new TestGC();
            list.add(gc);
        }

    }
}
