package com.learn.guava;

import com.google.common.base.Preconditions;
import org.junit.Test;

public class PreconditionTest {
    @Test
    public void test1() {
        int i = 0;
        int[] nums = new int[10];
        Preconditions.checkArgument(i >= 0, "i should be bigger than 0", i);
        Preconditions.checkElementIndex(0, nums.length);
    }
}
