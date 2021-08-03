package com.jordanstgodard.leetcode;

import java.util.HashMap;

public class _1748 {
    public int sumOfUnique(int[] nums) {
        var sum = 0;
        final var map = new HashMap<Integer, Boolean>();

        for (var i = 0; i < nums.length; ++i) {
            final var x = nums[i];
            map.put(x, !map.containsKey(x));
        }

        final var set = map.keySet();
        for (final var key : set) {
            final var unique = map.get(key);
            if (unique) {
                sum += key;
            }
        }

        return sum;
    }
}
