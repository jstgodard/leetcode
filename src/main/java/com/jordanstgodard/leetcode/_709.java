package com.jordanstgodard.leetcode;

public class _709 {
    public String toLowerCase(String s) {
        final var arr = s.toCharArray();

        for (var i = 0; i < arr.length; ++i) {
            arr[i] = (char) (arr[i] >= 'A' && arr[i] <= 'Z' ? arr[i] + 32: arr[i]);
        }

        return new String(arr);
    }
}
