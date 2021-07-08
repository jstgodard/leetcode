package com.jordanstgodard.leetcode;

import java.util.HashSet;

public class _771 {
    public int numJewelsInStones(String jewels, String stones) {
        final var set = new HashSet<Character>();

        final var j = jewels.toCharArray();

        for (var i = 0; i < j.length; ++i) {
            set.add(j[i]);
        }

        final var s = stones.toCharArray();
        var jewelCount = 0;

        for (var i = 0; i < s.length; ++i) {
            if (set.contains(s[i])) {
                jewelCount++;
            }
        }

        return jewelCount;
    }
}
