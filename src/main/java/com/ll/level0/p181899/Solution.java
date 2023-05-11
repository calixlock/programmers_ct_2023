package com.ll.level0.p181899;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[start-end+1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = start-(i);
        }
        return answer;
    }
    public int[] solution2(int start, int end){
        return IntStream.rangeClosed(end,start)
                .boxed()
                .collect(Collectors.toList())
                .stream()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
