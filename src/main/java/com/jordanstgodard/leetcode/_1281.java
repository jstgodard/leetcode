package com.jordanstgodard.leetcode;

public class _1281 {
    public int subtractProductAndSum(int n) {
        final var x = Integer.toString(n).toCharArray();

        var sum = 0;
        var product = 1;

        for (final var c : x) {
            sum += c - '0';
            product *= c - '0';
        }

        return product - sum;
    }
}
