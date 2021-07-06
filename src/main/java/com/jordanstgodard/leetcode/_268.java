package com.jordanstgodard.leetcode;

public class _268 {
    public int missingNumber(int[] nums) {
        final var n = nums.length;
        var missing = 0;

        for (var i = 0; i <= n; ++i) {
            missing ^= i;
        }

        for (var i = 0; i < n; ++i) {
            missing ^= nums[i];
        }

        return missing;
    }
}
