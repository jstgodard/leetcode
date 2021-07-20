package com.jordanstgodard.leetcode;

public class _58 {
    public int lengthOfLastWord(String s) {
        final var t = s.strip();
        final var n = t.length();

        if (n <= 1) {
            return n;
        }

        var i = n - 1;
        var count = 0;
        while (i >= 0 && t.charAt(i) != ' ') {
            count++;
            --i;
        }

        return count;
    }
}

