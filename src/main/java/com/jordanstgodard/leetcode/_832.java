package com.jordanstgodard.leetcode;

public class _832 {
    public int[][] flipAndInvertImage(int[][] image) {
        final var n = image.length;

        for (var i = 0; i < n; ++i) {
            final var m = image[i].length;
            final var midpoint = m % 2 == 0 ? m / 2 : m / 2 + 1;

            for (var j = 0; j < midpoint; ++j) {
                final var temp = image[i][j] == 1 ? 0 : 1;
                image[i][j] = image[i][m - j - 1] == 1 ? 0 : 1;
                image[i][m - j - 1] = temp;
            }
        }

        return image;
    }
}
