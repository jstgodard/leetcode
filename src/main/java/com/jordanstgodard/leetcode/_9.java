package com.jordanstgodard.leetcode;

public class _9 {
    public boolean isPalindrome(int x) {
        final var s = String.valueOf(x).toCharArray();
        final var n = s.length;

        System.out.println("Before: s = " + new String(s));

        for (int i = 0; i < n / 2; ++i) {
            final var temp = s[i];
            s[i] = s[n - i - 1];
            s[n - i - 1] = temp;
        }

        System.out.println("After: s = " + new String(s));

        return String.valueOf(x).equals(new String(s));
    }
}
