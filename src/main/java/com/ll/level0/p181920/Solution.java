package com.ll.level0.p181920;

import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end-start+1];
        for (int i = 0; i <answer.length ; i++) {
            answer[i] = start++;
        }
        return answer;
    }
    public int[] solution2(int start, int end){
        return IntStream.rangeClosed(start,end).toArray();
    }
}
