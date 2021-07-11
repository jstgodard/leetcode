package com.jordanstgodard.leetcode;

import java.util.Set;

public class _1704 {
    public boolean halvesAreAlike(String s) {
        final var set = Set.of(
            'a', 'e', 'i', 'o', 'u',
            'A', 'E', 'I', 'O', 'U'
        );

        final var n = s.length();
        var firstCount = 0;
        var secondCount = 0;

        for (int i = 0, j = n / 2; j < n; ++i, ++j) {
            if (set.contains(s.charAt(i))) {
                ++firstCount;
            }

            if (set.contains(s.charAt(j))) {
                ++secondCount;
            }
        }

        return firstCount == secondCount;
    }
}
