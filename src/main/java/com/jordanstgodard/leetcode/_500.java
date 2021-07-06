package com.jordanstgodard.leetcode;

import java.util.ArrayList;
import java.util.Set;

public class _500 {
    public String[] findWords(String[] words) {
        final var top = Set.of(
            'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p',
            'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P'
        );

        final var middle = Set.of(
            'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l',
            'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L'
        );

        final var bottom = Set.of(
            'z', 'x', 'c', 'v', 'b', 'n', 'm',
            'Z', 'X', 'C', 'V', 'B', 'N', 'M'
        );

        final var result = new ArrayList<String>();
        var k = 0;

        for (var i = 0; i < words.length; ++i) {
            final var word = words[i];

            var isTop = true;
            var isMiddle = true;
            var isBottom = true;

            System.out.println("word = " + word);

            for (var j = 0; j < word.length(); ++j) {
                final var x = word.charAt(j);

                System.out.println("word[" + j + "] = " + x);

                if (!top.contains(x)) {
                    isTop = false;
                }

                if (!middle.contains(x)) {
                    isMiddle = false;
                }

                if (!bottom.contains(x)) {
                    isBottom = false;
                }
            }

            System.out.println("isTop = " + isTop
                    + ", isMiddle = " + isMiddle
                    + ", isBottom = " + isBottom);
            if (isTop || isMiddle || isBottom) {
                result.add(word);
            }
        }

        return result.toArray(new String[result.size()]);
    }
}
