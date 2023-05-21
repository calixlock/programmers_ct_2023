package com.ll.level0.p120862;

import java.util.*;

public class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int a = Arrays.stream(numbers)
                .sorted()
                .limit(2)
                .reduce(1, (x, y) -> x * y);
        int b = Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .reduce(1, (x, y) -> x * y);
        answer = a >= b ? a : b;
        return answer;
    }
    public int solution2(int[] numbers) {
        int numLen = numbers.length;
        int answer = 0;
        Arrays.sort(numbers);
        answer = numbers[0] * numbers[1] >= numbers[numLen - 1] * numbers[numLen - 2] ? numbers[0] * numbers[1] : numbers[numLen - 1] * numbers[numLen - 2];
        return answer;
    }
}
