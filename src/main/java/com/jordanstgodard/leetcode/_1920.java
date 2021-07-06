package com.jordanstgodard.leetcode;

public class _1920 {
    public int[] buildArray(int[] nums) {
        final var result = new int[nums.length];

        for (var i = 0; i < nums.length; ++i) {
            result[i] = nums[nums[i]];
        }

        return result;
    }
}
