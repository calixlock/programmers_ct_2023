package com.ll.level0.p181873;

public class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        answer = my_string.replace(alp,alp.toUpperCase());
        return answer;
    }
}
