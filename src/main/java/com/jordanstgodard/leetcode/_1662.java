package com.jordanstgodard.leetcode;

public class _1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        final var sb1 = new StringBuilder();
        final var sb2 = new StringBuilder();

        for (var i = 0; i < word1.length; ++i) {
            sb1.append(word1[i]);
        }

        for (var i = 0; i < word2.length; ++i) {
            sb2.append(word2[i]);
        }

        return sb1.toString().equals(sb2.toString());
    }
}
