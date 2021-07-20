package com.jordanstgodard.leetcode;

public class _1295 {
    public int findNumbers(int[] nums) {
        var count = 0;
        for (var i = 0; i < nums.length; ++i) {
            if (Integer.toString(nums[i]).length() % 2 == 0) {
                ++count;
            }
        }

        return count;
    }
}
