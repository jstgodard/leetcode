package com.jordanstgodard.leetcode;

public class _1342 {
    public int numberOfSteps(int num) {
        var count = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                --num;
            }

            ++count;
        }

        return count;
    }
}
