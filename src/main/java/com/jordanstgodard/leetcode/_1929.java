package com.jordanstgodard.leetcode;

public class _1929 {
    public int[] getConcatenation(int[] nums) {
        final var n = nums.length;
        final var m = n * 2;
        final var result = new int[m];

        for (var i = 0; i < n; ++i) {
            result[i] = nums[i];
            result[i + n] = nums[i];
        }

        return result;
    }
}
