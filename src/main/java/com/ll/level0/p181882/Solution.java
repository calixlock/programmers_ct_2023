package com.ll.level0.p181882;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        return Arrays.stream(arr)
                .map(e -> {
                    if (e % 2 == 0 && e >= 50) {
                        return e / 2;
                    } else if (e % 2 != 0 && e < 50) {
                        return e * 2;
                    } else {
                        return e;
                    }
                })
                .toArray();
    }
    public int[] solution2(int[] arr) {
        int[] answer = new int[arr.length];
        int i = 0;
        for (int num : arr) {
            if (num % 2 == 0 && num >= 50) {
                answer[i] = num/2;
            }else if (num % 2 != 0 && num <50){
                answer[i] = num*2;
            }else {
                answer[i] = num;
            }i++;
        }
        return  answer;
    }

}
