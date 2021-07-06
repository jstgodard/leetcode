package com.jordanstgodard.leetcode;

public class _1480 {
    public int[] runningSum(int[] nums) {
        final var result = new int[nums.length];

        var sum = 0;

        for (var i = 0; i < nums.length; ++i) {
            sum += nums[i];
            result[i] = sum;
        }

        return result;
    }
}
