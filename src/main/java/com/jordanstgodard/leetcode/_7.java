package com.jordanstgodard.leetcode;

public class _7 {
    public int reverse(int x) {
        final var isNegative = x < 0;
        final var s = Integer.toString(x).replace("-", "");
        final var n = s.length();
        final var midpoint = n % 2 == 0 ? n / 2 : (n / 2) + 1;

        final var arr = s.toCharArray();

        for (var i = 0; i < midpoint; ++i) {
            final var temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        try {
            return Integer.parseInt(new String(arr)) * (isNegative ? -1 : 1);
        } catch (final NumberFormatException e) {
        }

        return 0;
    }
}
