package com.ll.level0.p181842;

import java.util.Arrays;

public class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        answer = str2.length() != str2.replace(str1, "").length() ? 1 : 0;
        return answer;
    }
    public int solution2(String s1, String s2){
        int answer = s2.contains(s1) ? 1: 0;
        return answer;
    }
    public int solution3(String s1, String s2){
        int answer = s2.indexOf(s1) == -1 ? 0: 1;
        return answer;
    }
}
