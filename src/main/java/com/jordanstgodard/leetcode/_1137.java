package com.jordanstgodard.leetcode;

import java.util.HashMap;

public class _1137 {
    public int tribonacci(int n) {
        final var map = new HashMap<Integer, Integer>(n);
        map.put(0, 0);
        map.put(1, 1);
        map.put(2, 1);

        var i = 3;
        while (i <= n) {
            map.put(i, map.get(i - 1) + map.get(i - 2) + map.get(i - 3));
            i++;
        }

        return map.get(n);
    }
}
