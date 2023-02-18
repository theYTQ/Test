package com.learn.code.chapter1;

import com.alibaba.fastjson.JSON;

import java.util.Stack;

public class NearLessValue {
    public static void main(String[] args) {
        int[] nums = {3, 4, 1, 5, 6, 2, 7};
        int[][] res = nearLessNoRepeat(nums);
        System.out.println(JSON.toJSONString(res));
    }

    private static int[][] nearLessNoRepeat(int[] nums) {
        int n = nums.length;
        int[][] res = new int[n][2];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                int popIndex = stack.pop();
                int leftLessIndex = stack.isEmpty() ? -1 : stack.peek();
                res[popIndex][0] = leftLessIndex;
                res[popIndex][1] = i;
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int popIndex = stack.pop();
            int leftLessIndex = stack.isEmpty() ? -1 : stack.peek();
            res[popIndex][0] = leftLessIndex;
            res[popIndex][1] = -1;
        }
        return res;
    }
}
