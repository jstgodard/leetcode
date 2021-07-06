package com.jordanstgodard.leetcode;

import java.util.TreeMap;

public class _977 {
    public int[] sortedSquares(int[] nums) {
        // nums[i] ^ 2 -> count
        final var map = new TreeMap<Integer, Integer>();

        for (var i = 0; i < nums.length; ++i) {
            final var square = nums[i] * nums[i];
            map.put(square, map.getOrDefault(square, 0) + 1);
        }

        System.out.println("map = " + map);

        final var result = new int[nums.length];

        var index = 0;
        for (final var key : map.keySet()) {
            final var value = map.get(key);
            for (var i = 0; i < value; ++i) {
                result[index++] = key;
            }
        }

        return result;
    }
}
