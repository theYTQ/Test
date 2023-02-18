package com.learn.code.chapter1;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseStack {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }
        System.out.println(stack);
        reverseStack(stack);
        System.out.println(stack);
    }

    public static void reverseStack(Deque<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int last = getAndRemoveLast(stack);
        reverseStack(stack);
        stack.push(last);
    }

    private static int getAndRemoveLast(Deque<Integer> stack) {
        int result = stack.pop();
        if (stack.isEmpty()) {
            return result;
        } else {
            int last = getAndRemoveLast(stack);
            stack.push(result);
            return last;
        }
    }
}
