package com.jordanstgodard.leetcode;

public class _1678 {
    public String interpret(String command) {
        final var n = command.length();
        final var sb = new StringBuilder();

        for (var i = 0; i < n; ++i) {
            final var c = command.charAt(i);

            if (c == 'G') {
                sb.append("G");
            } else if (c == '(' && i + 1 < n && command.charAt(i + 1) == ')') {
                sb.append("o");
                i += 1;
            } else {
                sb.append("al");
                i += 3;
            }
        }

        return sb.toString();
    }
}
