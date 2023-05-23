package com.ll.level0.p181911;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for (int i = 0; i < my_strings.length; i++) {
            answer += my_strings[i].substring(parts[i][0],parts[i][1]+1);
        }
        return answer;
    }
    public String solution2(String[] my_strings, int[][] parts) {
        return IntStream.range(0,my_strings.length)
                .mapToObj(e ->my_strings[e].substring(parts[e][0], parts[e][1] + 1))
                .collect(Collectors.joining());
    }
}
