package com.jordanstgodard.leetcode;

import java.util.HashMap;

public class _219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // value -> indices
        final var map = new HashMap<Integer, Integer>();

        for (var i = 0; i < nums.length; ++i) {
            final var x = nums[i];

            if (map.containsKey(x) && i - map.get(x) <= k) {
                return true;
            } else {
                map.put(x, i);
            }
        }

        return false;
    }
}
