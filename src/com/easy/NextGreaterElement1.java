package com.easy;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement1 {
    public int[] nextGreater(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> greatestMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                greatestMap.put(stack.pop(), num);
            }
            stack.push(num);
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = greatestMap.getOrDefault(nums1, -1);
        }
        return nums1;
    }
}