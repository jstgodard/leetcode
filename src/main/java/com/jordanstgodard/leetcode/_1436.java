package com.jordanstgodard.leetcode;

import java.util.HashMap;
import java.util.List;

public class _1436 {
    public String destCity(List<List<String>> paths) {
        final var map = new HashMap<String, String>();

        for (final var l : paths) {
            final var source = l.get(0);
            final var destination = l.get(1);

            map.put(source, destination);
        }

        for (final var key : map.keySet()) {
            final var destination = map.get(key);

            if (!map.containsKey(destination)) {
                return destination;
            }
        }

        return null;
    }
}
