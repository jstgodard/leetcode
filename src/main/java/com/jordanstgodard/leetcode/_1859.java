package com.jordanstgodard.leetcode;

import java.util.TreeMap;

public class _1859 {
    public String sortSentence(String s) {
        final var map = new TreeMap<Integer, String>();
        final var sb = new StringBuilder();
        final var arr = s.split(" ");

        for (final var word : arr) {
            final var cleansedWord = word.substring(0, word.length() - 1);
            map.put((int) word.charAt(word.length() - 1), cleansedWord);
        }

        for (final var key : map.keySet()) {
            final var word = map.get(key);
            sb.append(word).append(" ");
        }

        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }
}
