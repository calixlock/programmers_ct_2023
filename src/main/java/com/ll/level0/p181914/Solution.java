package com.ll.level0.p181914;

public class Solution {
    public int solution(String number) {
        int answer = 0;
        for (String a: number.split("")
             ) {
            answer += Integer.valueOf(a);
        }
        answer %= 9;
        return answer;
    }
}
