package com.ll.level0.p120585;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        // for문이 처리속도가 더빠르다.
        for (int n:
             array) {
            if (n > height) answer++;
        }
        return answer;
    }
    public  int solution2(int[] array, int height) {
        int answer = 0;
        return (int) Arrays.stream(array)
                .filter(e-> e>height)
                .count();
    }
}
