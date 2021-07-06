package com.jordanstgodard.leetcode;

public class _1672 {
    public int maximumWealth(int[][] accounts) {
        var max = Integer.MIN_VALUE;

        for (var i = 0; i < accounts.length; ++i) {

            var wealth = 0;
            for (var j = 0; j < accounts[i].length; ++j) {
                wealth += accounts[i][j];
            }

            if (wealth > max) {
                max = wealth;
            }
        }

        return max;
    }
}
