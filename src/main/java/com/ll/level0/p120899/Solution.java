package com.ll.level0.p120899;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int[] array) {
        int[] answer = {};
        answer = new int[2];
        answer[0] = Arrays.stream(array)
                .max()
                .getAsInt();
        for (int i = 0; i < array.length; i++) {
            if(array[i] == answer[0]){ answer[1] = i; break; }
        }
        return answer;
    }
    public int[] solution2(int[] array){
        int[] answer = new int[2];
        for (int i = 0; i <array.length; i++) {
            if(array[i]>answer[0]){
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }
}
