package com.learn.guava;

import com.google.common.base.Throwables;
import org.junit.Test;

public class ThrowablesTest {
    @Test
    public void test1() throws InterruptedException {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        } catch (Throwable t) {
            Throwables.propagateIfPossible(t, InterruptedException.class);
        }
    }
}
