package com.jordanstgodard.leetcode;

import java.util.HashMap;

public class _1108 {
    public String defangIPaddr(String address) {
        final var sb = new StringBuilder();
        final var n = address.length();

        for (var i = 0; i < n; ++i) {
            final var c = address.charAt(i);

            if (c == '.') {
                sb.append("[.]");
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
