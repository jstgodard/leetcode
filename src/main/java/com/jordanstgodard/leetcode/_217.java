package com.jordanstgodard.leetcode;

import java.util.HashSet;

public class _217 {
    public boolean containsDuplicate(int[] nums) {
        final var set = new HashSet<Integer>();

        for (var i = 0; i < nums.length; ++i) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }

        return false;
    }
}
