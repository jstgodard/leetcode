package com.jordanstgodard.leetcode;

import java.util.LinkedList;

public class _66 {
    public int[] plusOne(int[] digits) {
        var shouldAddExtra = true;
        var carry = digits[digits.length - 1] == 9;

        final var queue = new LinkedList<Integer>();

        for (var i = digits.length - 1; i >= 0; --i) {
            final var x = digits[i];

            if (x != 9) {
                shouldAddExtra = false;
            }

            if (carry && x == 9) {
                queue.add(0);
                carry = true;
            } else if (carry && x < 9) {
                queue.add(digits[i] + 1);
                // carry = digits[i] + 1 == 9;
                carry = false;
            } else {
                carry = false;
                final var addValue = i == digits.length - 1 ? digits[i] + 1 : digits[i];
                queue.add(addValue);
            }
        }

        if (shouldAddExtra) {
            queue.add(1);
        }

        final var result = new int[queue.size()];

        var i = 0;
        while (!queue.isEmpty()) {
            result[i++] = queue.removeLast();
        }

        return result;
    }
}
