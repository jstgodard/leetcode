package com.jordanstgodard.leetcode;

public class _344 {
    public void reverseString(char[] s) {
        final var n = s.length;
        final var midpoint = s.length % 2 == 0 ? (int) s.length / 2 : (int) (s.length / 2) + 1;

        for (var i = 0; i < midpoint; ++i) {
            final var temp = s[i];
            s[i] = s[n - i - 1];
            s[n - i - 1] = temp;
        }
    }
}
