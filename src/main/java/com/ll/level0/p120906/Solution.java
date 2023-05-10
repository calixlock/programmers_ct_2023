package com.ll.level0.p120906;

import java.util.Arrays;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int tmp = n;
        while (tmp >0){
            answer += tmp%10;  // 끝자리
            tmp = tmp/10; // 줄이기
        }return answer;
    }
    public int solution2(int n){
        int answer = 0;
        return Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
