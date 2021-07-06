package com.jordanstgodard.leetcode;

import java.util.HashMap;
import java.util.TreeSet;

public class _1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        final var n = nums.length;
        final var set = new TreeSet<Integer>();
        final var map = new HashMap<Integer, Integer>(n);

        for (var i = 0; i < n; ++i) {
            final var x = nums[i];
            set.add(x);
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        final var result = new int[n];
        final var first = set.first();
        for (var i = 0; i < n; ++i) {
            final var x = nums[i];
            final var subset = set.headSet(x);
            result[i] = 0;

            for (final var k : subset) {
                result[i] += map.get(k);
            }
        }

        return result;
    }
}
