package com.ll.level0.p181904;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";

        for (int i = c-1; i < my_string.length(); i += m) {
//            answer += my_string.substring(i,i+1);
            answer += my_string.charAt(i);
        }
        return answer;
    }
    public String solution2(String my_string, int m, int c) {
        return IntStream.range(0,my_string.length())
                .filter(e -> (e % m) == (c-1))
                .mapToObj(i ->String.valueOf(my_string.charAt(i)))
                .collect(Collectors.joining());
    }
}
