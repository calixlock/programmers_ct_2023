package com.ll.level0.p120811;

import java.util.Arrays;

public class Solution {
    // 선택정렬 이용
    public int solution(int[] array) {
        int answer = 0;
        int minIndex = 0;
        for (int i = 0; i < array.length-1; i++) {
            minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j] < array[minIndex]) minIndex = j;
            }int tmp = array[i];
            array[i]=array[minIndex];
            array[minIndex]=tmp;
        }
        answer = array[(array.length/2)];
        return answer;
    }
    public int solution2(int[] arr){
        int answer = 0;
        Arrays.sort(arr);
        answer = arr[arr.length/2];
//        answer = arr[arr.length >> 1]; // 쉬프트 연산 [/2^1]
        return answer;
    }
}

