package com.jordanstgodard.leetcode;

import java.util.HashMap;

public class _1512 {
    public int numIdenticalPairs(int[] nums) {
        // value -> count
        final var map = new HashMap<Integer, Integer>();
        var count = 0;

        for (var i = 0; i < nums.length; ++i) {
            final var x = nums[i];
            final var occurences = map.getOrDefault(x, 0);

            count += occurences;
            map.put(x, occurences + 1);
        }

        return count;
    }
}
