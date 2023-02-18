package com.learn.guava;

import com.google.common.base.Joiner;
import org.junit.Test;

public class StringTest {
    @Test
    public void joinerTest() {
        Joiner joiner = Joiner.on(",").skipNulls();
        String s = joiner.join("A", null, "B", "C");
        System.out.println(s);
    }
}
