package com.learn.code.chapter1;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class SortStackByStack {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.addAll(List.of(1, 2, 6, 4, 3, 5));
        sort(stack);
        System.out.println(stack);
    }

    private static void sort(Deque<Integer> stack) {
        Deque<Integer> help = new ArrayDeque<>();
        while (!stack.isEmpty()) {
            int peek = stack.pop();
            while (!help.isEmpty() && help.peek() < peek) {
                stack.push(help.pop());
            }
            help.push(peek);
        }
        while (!help.isEmpty()) {
            stack.push(help.pop());
        }
    }
}
