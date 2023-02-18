package com.learn.code.chapter1;

import java.util.Arrays;
import java.util.LinkedList;

public class GetMaxWindow {
    public static void main(String[] args) {
        int[] nums = {4, 3, 5, 4, 3, 3, 6, 7};
        System.out.println(Arrays.toString(getMaxWindow(nums, 3)));
    }

    private static int[] getMaxWindow(int[] nums, int w) {
        int n = nums.length;
        int[] res = new int[n - w + 1];
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < w; i++) {
            while (!list.isEmpty() && list.peekLast() < nums[i]) {
                list.pollLast();
            }
            list.addLast(nums[i]);
        }
        int idx = 0;
        res[idx++] = list.peekFirst();
        for (int i = w; i < n; i++) {
            if (nums[i - w] == list.peekFirst()) {
                list.removeFirst();
            }
            while (!list.isEmpty() && list.peekLast() < nums[i]) {
                list.pollLast();
            }
            list.addLast(nums[i]);
            res[idx++] = list.peekFirst();
        }
        return res;
    }
}
