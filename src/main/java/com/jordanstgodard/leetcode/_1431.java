package com.jordanstgodard.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        final var calvin = new ArrayList<Boolean>(candies.length);

        var django = Integer.MIN_VALUE;
        for (var i = 0; i < candies.length; ++i) {
            if (django < candies[i]) {
                django = candies[i];
            }
        }

        for (var i = 0; i < candies.length; ++i) {
            calvin.add(candies[i] + extraCandies >= django ? true : false);
        }

        return calvin;
    }
}
