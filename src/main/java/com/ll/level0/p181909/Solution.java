package com.ll.level0.p181909;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        answer = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = my_string.substring(i,my_string.length());
        }
//        answer = Arrays.stream(answer)
//                .sorted()
//                .toArray(String[]::new);
        Arrays.sort(answer);
        return answer;
    }
    public String[] solution2(String my_string) {
        return IntStream.range(0,my_string.length())
//                .mapToObj(my_string::substring)
                .mapToObj(e->my_string.substring(e))
                .sorted()
                .toArray(String[]::new);
    }
}

