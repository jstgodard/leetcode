package com.jordanstgodard.leetcode;

public class _1913 {
    public int maxProductDifference(int[] nums) {
        var max = Integer.MIN_VALUE;
        var min = Integer.MAX_VALUE;

        var secondMax = Integer.MIN_VALUE + 1;
        var secondMin = Integer.MAX_VALUE - 1;

        for (var i = 0; i < nums.length; ++i) {
            final var x = nums[i];

            if (x >= max) {
                secondMax = max;
                max = x;
            } else if (x > secondMax) {
                secondMax = x;
            }

            if (x <= min) {
                secondMin = min;
                min = x;
            } else if (x < secondMin) {
                secondMin = x;
            }
        }

        return (max * secondMax) - (min * secondMin);
    }
}
