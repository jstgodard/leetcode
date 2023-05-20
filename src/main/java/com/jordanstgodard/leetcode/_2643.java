package com.jordanstgodard.leetcode;

public class _2643 {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxRow = 0;
        int maxRowCount = 0;

        for (int i = 0; i < mat.length; ++i) {

            int onesRowCount = 0;

            for (int j = 0; j < mat[i].length; ++j) {
                if (mat[i][j] == 1) {
                    ++onesRowCount;
                }
            }

            if (onesRowCount > maxRowCount) {
                maxRow = i;
                maxRowCount = onesRowCount;
            }
        }

        final int max[] = new int[] { maxRow, maxRowCount };

        return max;
    }
}
