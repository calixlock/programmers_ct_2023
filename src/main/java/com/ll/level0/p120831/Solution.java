package com.ll.level0.p120831;

import java.util.stream.IntStream;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = 0; i<=n; i++){
            if(i%2==0){
                answer+=i;
            }
        }
        return answer;
    }
    public int solution2(int n){
        return IntStream.rangeClosed(0,n)
                .filter(e -> e % 2 == 0)
                .sum();
    }
}