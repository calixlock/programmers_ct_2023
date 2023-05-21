package com.ll.level0.p181841;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for (String str :
                str_list) {
            answer += str.contains(ex)? "":str;
        }
        return answer;
    }
    public String solution2(String[] str_list, String ex) {
        return Arrays.stream(str_list)
                .filter(e-> !e.contains(ex))
                .collect(Collectors.joining());
    }
}
