package com.learn.guava;

import com.google.common.collect.Ordering;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class OrderingTest {
    @Test
    public void test1() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.sort(Ordering.<Integer>natural().reversed());
        System.out.println(list.toString());

        Ordering<Integer> ordering = Ordering.natural();
        List<Integer> list2 = ordering.greatestOf(list, 1);
        System.out.println(list2.toString());
        System.out.println(ordering.isOrdered(list));
    }
}
