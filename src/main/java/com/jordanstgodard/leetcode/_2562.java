package com.jordanstgodard.leetcode;

public class _2562 {
    public long findTheArrayConcVal(int[] nums) {
        final int n = nums.length;
        final int midpoint = n / 2;

        long sum = 0;

        for (int i = 0, j = n - 1; i < midpoint; ++i, --j) {
            final String concat = Integer.toString(nums[i]) + Integer.toString(nums[j]);
            sum += Long.parseLong(concat);
        }

        if (n % 2 == 1) {
            sum += Long.parseLong(Integer.toString(nums[midpoint]));
        }

        return sum;
    }
}
