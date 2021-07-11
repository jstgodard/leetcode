package com.jordanstgodard.leetcode;

public class _1486 {
    public int xorOperation(int n, int start) {
        final var nums = new int[n];

        for (var i = 0; i < n; ++i) {
            nums[i] = start + (2 * i);
        }

        var xor = nums[0];
        for (var i = 1; i < n; ++i) {
            xor ^= nums[i];
        }

        return xor;
    }
}
