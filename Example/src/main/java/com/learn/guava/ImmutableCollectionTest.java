package com.learn.guava;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ImmutableCollectionTest {
    @Test
    public void test1() {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "B");
        map.put(1, "A");
        ImmutableMap<Integer, String> imap = ImmutableMap.copyOf(map);
        System.out.println(imap.get(1));
    }
}
