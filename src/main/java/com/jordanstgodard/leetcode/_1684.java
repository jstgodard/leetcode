package com.jordanstgodard.leetcode;

import java.util.HashSet;

public class _1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        final var set = new HashSet<Character>();

        final var m = allowed.length();
        for (var i = 0; i < m; ++i) {
            set.add(allowed.charAt(i));
        }

        var count = 0;

        for (final var word : words) {
            final var n = word.length();

            var isConsistent = true;

            for (var i = 0; i < n; ++i) {
                if (!set.contains(word.charAt(i))) {
                    isConsistent = false;
                    break;
                }
            }

            count = isConsistent? count + 1 : count;
        }

        return count;
    }
}
