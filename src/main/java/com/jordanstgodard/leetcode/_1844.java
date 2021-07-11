package com.jordanstgodard.leetcode;

public class _1844 {
    public String replaceDigits(String s) {
        final var arr = s.toCharArray();

        for (var i = 0; i < arr.length - 1; i += 2) {
            final var c = (int) arr[i];
            final var shift = Integer.parseInt(String.valueOf(arr[i + 1]));

            final var temp = (char) (c + shift);

            arr[i + 1] = temp;

        }

        return new String(arr);
    }
}
