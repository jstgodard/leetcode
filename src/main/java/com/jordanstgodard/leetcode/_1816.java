package com.jordanstgodard.leetcode;

public class _1816 {
    public String truncateSentence(String s, int k) {
        final var arr = s.split(" ");
        final var sb = new StringBuilder();

        for (var i = 0; i < k; ++i) {
            sb.append(arr[i])
                    .append(" ");
        }

        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }
}
