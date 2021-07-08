package com.jordanstgodard.leetcode;

public class _1528 {
    public String restoreString(String s, int[] indices) {
        final var result = new char[s.length()];

        for (var i = 0; i < result.length; ++i) {
            final var x = indices[i];
            result[x] = s.charAt(i);
        }

        return new String(result);
    }
}
