package com.jordanstgodard.leetcode;

public class _1812 {
    public boolean squareIsWhite(String coordinates) {
        return (coordinates.charAt(0) + coordinates.charAt(1) - 'a') % 2 == 0;
    }
}
