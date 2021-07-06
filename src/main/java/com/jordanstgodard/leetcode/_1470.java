package com.jordanstgodard.leetcode;

public class _1470 {
    public int[] shuffle(int[] nums, int n) {
        var i = 0;
        var j = n;

        final var result = new int[nums.length];

        for (var k = 0; k < nums.length; ++k) {
            if (k % 2 == 0) {
                result[k] = nums[i++];
            } else {
                result[k] = nums[j++];
            }
        }

        return result;
    }
}
