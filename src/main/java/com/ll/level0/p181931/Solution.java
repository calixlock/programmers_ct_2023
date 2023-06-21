package com.ll.level0.p181931;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (int i = 0; i < included.length; i++) {
//            if (included[i] == true) answer += (a+i*d);
            answer += included[i] ?  (a+i*d) : 0;
        }
        return answer;
    }
    public int solution2(int a, int d, boolean[] included) {
        return IntStream.range(0,included.length)
                .map(e -> included[e] ? (a + (e * d)) : 0)
                .sum();
    }
    public int solution3(int a, int d, boolean[] included) {
        return IntStream.range(0, included.length)
                .filter(e -> included[e])
                .map(e -> a + e * d)
                .sum();
    }
}

