package com.ll.level0.p120817;

import java.util.Arrays;

public class Solution {
    public double solution(int[] numbers) {
        double answer = Arrays.stream(numbers)
                .mapToDouble(e -> e)
                .average().orElse(0);
        System.out.println(numbers);
        return answer;
    }
    public double solution2(int[] numbers) {
        double answer, sum = 0;
        for (int i : numbers){
            sum += i;
        }
        answer = sum / (double)numbers.length;
        return answer;
    }
}
