package com.jordanstgodard.leetcode;

public class _551 {
    public boolean checkRecord(String s) {
        var totalAbsences = 0;
        var lateCount = 0;
        final var n = s.length();

        for (var i = 0; i < n; ++i) {
            final var c = s.charAt(i);

            if (c == 'A') {
                ++totalAbsences;
                lateCount = 0;
            } else if (c == 'P') {
                lateCount = 0;
            } else {
                ++lateCount;
            }

            if (totalAbsences >= 2 || lateCount >= 3) {
                return false;
            }
        }

        return true;
    }
}
