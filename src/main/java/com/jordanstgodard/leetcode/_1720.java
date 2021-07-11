package com.jordanstgodard.leetcode;

public class _1720 {
    public int[] decode(int[] encoded, int first) {
        final var result = new int[encoded.length + 1];
        result[0] = first;

        for (var i = 1; i < encoded.length + 1; ++i) {
            result[i] = result[i - 1] ^ encoded[i - 1];
        }

        return result;
    }
}
