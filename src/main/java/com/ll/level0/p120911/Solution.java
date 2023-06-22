package com.ll.level0.p120911;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public String solution(String my_string) {
        String answer = Arrays.stream(my_string.toLowerCase().split(""))
                .sorted()
                .collect(Collectors.joining());
        return answer;
    }
    public String solution2(String my_string) {
        char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        return new String(c);
//        return new String.valueOf(c);
    }
}


