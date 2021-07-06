package com.jordanstgodard.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _412 {
    public List<String> fizzBuzz(int n) {
        final var result = new ArrayList<String>();

        for (var i = 1; i < n + 1; ++i) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
            }
        }

        return result;
    }
}
