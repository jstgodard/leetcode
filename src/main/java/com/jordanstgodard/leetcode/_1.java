package com.jordanstgodard.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public class _1 {
    public int[] twoSum(int[] nums, int target) {
        final var map = new HashMap<Integer, Set<Integer>>();

        for (var i = 0; i < nums.length; ++i) {
            final var j = target - nums[i];

            if (map.containsKey(nums[i])) {
                final var set = map.get(nums[i]);
                set.add(i);
            } else {
                final var set = new HashSet<Integer>();
                set.add(i);
                map.put(nums[i], set);
            }

            final var set = map.getOrDefault(j, new HashSet<Integer>());
            final var ref = new AtomicReference<Integer>(i);
            final var secondIndex = set.stream().filter(v -> v != ref.get()).findAny().orElse(-1);

            if (i != secondIndex && secondIndex > -1) {
                return new int[]{i, secondIndex};
            }
        }

        return new int[]{};
    }
}
