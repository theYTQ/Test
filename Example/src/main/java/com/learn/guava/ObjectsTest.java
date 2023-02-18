package com.learn.guava;

import com.google.common.base.Objects;
import org.junit.Test;

public class ObjectsTest {
    @Test
    public void test1() {
        User a = new User(1, "A", 10);
        User b = new User(1, null, 10);
        boolean eq = Objects.equal(a, b);
        System.out.println(eq);
    }
}
