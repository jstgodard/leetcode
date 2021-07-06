package com.jordanstgodard.leetcode;

import java.util.Set;

public class _824 {
    public String toGoatLatin(String sentence) {
        final var sb = new StringBuilder();
        final var vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        final var words = sentence.split(" ");

        var i = 1;
        for (final var word : words) {
            if (vowels.contains(word.charAt(0))) {
                sb.append(word).append("ma");
            } else {
                final var firstLetter = word.substring(0, 1);

                sb.append(word.substring(1, word.length()))
                        .append(firstLetter)
                        .append("ma");
            }

            sb.append("a".repeat(i++));
            sb.append(" ");
        }

        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }
}
