package com.jordanstgodard.leetcode;

import java.util.Map;

public class _13 {
    public int romanToInt(String s) {
        final var map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        final var n = s.length();
        var sum = 0;

        for (var i = n - 1; i >= 0; --i) {
            final var a = map.get(s.charAt(i));
            final var b = i > 0 ? map.get(s.charAt(i - 1)) : 0;

            System.out.println("a = " + a + ", b = " + b);

            if (a > b) {
                sum += a - b;
                --i;
            } else {
                sum += a;
            }
        }

        return sum;
    }
}
