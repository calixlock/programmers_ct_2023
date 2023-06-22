package com.ll.level0.p120846;

import java.util.stream.IntStream;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            answer += cal(i);
        }
        return answer;
    }
    private int cal(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if(num % i == 0) count++;
        }
        return count >= 3 ? 1:0;
    }
    public int solution2(int n){
        return (int) IntStream.rangeClosed(1,n)
                .filter(e -> cal(e) == 1)
                .count();
    }
    public int solution3(int n) {
        return (int) IntStream.rangeClosed(1, n)
                .filter(i -> (int) IntStream.rangeClosed(1, i)
                        .filter(i2 -> i % i2 == 0)
                        .count() > 2)
                .count();
    }

}
