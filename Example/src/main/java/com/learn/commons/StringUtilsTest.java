package com.learn.commons;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class StringUtilsTest {
    @Test
    public void test1() {
        String str = "   ";
        System.out.println(StringUtils.isBlank(str));
        System.out.println("Hello World!");
    }
}
