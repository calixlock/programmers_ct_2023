package com.ll.level0.p181914;

import java.util.Arrays;

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
    public int solution2(String number) {
        return number.chars().map(e-> (e-'0')).sum()%9;
    }
    public int solution3(String number) { //integer.valueOf 보다 빠르다
        int answer = 0;

        for(int i=0; i<number.length(); i++) {
            answer += number.charAt(i) - '0';
        }
        answer %= 9;
        return answer;
    }
    public int solution4(String number){
        int answer = 0;
        return Arrays.stream(number.split(""))
                .mapToInt(Integer::parseInt)
                .sum()%9;
    }
}
