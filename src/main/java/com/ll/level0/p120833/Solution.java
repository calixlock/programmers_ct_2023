package com.ll.level0.p120833;

import java.util.Arrays;

public class Solution {
    public int[]solution(int[]numbers, int num1, int num2){
        int j =0;
        int[] answer = {};
        answer = new int[num2-num1+1];
        for (int i = num1; i <= num2 ; i++) {
            answer[j++] = numbers[i];
        }
        return answer;
    }
    public int[]solution2(int[]numbers,int num1,int num2){
        int[] answer = Arrays.copyOfRange(numbers,num1,num2+1);
        return answer;
    }
}
