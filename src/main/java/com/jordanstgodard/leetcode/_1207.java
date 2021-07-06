package com.jordanstgodard.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class _1207 {
    public boolean uniqueOccurrences(int[] arr) {
        final var n = arr.length;
        final var map = new HashMap<Integer, Integer>();

        for (var i = 0; i < n; ++i) {
            final var x = arr[i];
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        final var values = map.values();

        return values.size() == new HashSet<Integer>(values).size();
    }
}
