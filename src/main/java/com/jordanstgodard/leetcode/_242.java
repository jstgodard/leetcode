package com.jordanstgodard.leetcode;

import java.util.HashMap;

public class _242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        final var n = s.length();
        final var map = new HashMap<Character, Integer>(s.length());

        for (var i = 0; i < n; ++i) {
            final var c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println("map = " + map);

        for (var i = 0; i < n; ++i) {
            final var c = t.charAt(i);
            final var count = map.get(c);

            if (count == null || count - 1 < 0) {
                return false;
            } else {
                map.put(c, count - 1);
            }
        }

        return true;
    }
}
