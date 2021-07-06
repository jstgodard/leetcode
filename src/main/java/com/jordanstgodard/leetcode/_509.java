package com.jordanstgodard.leetcode;

import java.util.HashMap;

public class _509 {
    public int fib(int n) {
        final var map = new HashMap<Integer, Integer>(n);
        map.put(0, 0);
        map.put(1, 1);

        var i = 2;
        while (i <= n) {
            map.put(i, map.get(i - 1) + map.get(i - 2));
            i++;
        }

        return map.get(n);
    }
}
