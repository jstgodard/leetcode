package com.jordanstgodard.leetcode;

import java.util.HashSet;

public class _1832 {
    public boolean checkIfPangram(String sentence) {
        final var set = new HashSet<Character>();
        final var n = sentence.length();

        for (var i = 0; i < n; ++i) {
            if (set.size() == 26) {
                return true;
            }

            set.add(sentence.charAt(i));
        }

        return set.size() == 26;
    }
}
