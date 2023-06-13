package com.ll.level0.p181867;

import java.util.Arrays;

public class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        String[] strArr = myString.split("x");
        answer = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            answer[i] = strArr[i].length();
        }
        System.out.println(Arrays.toString(strArr));
        return answer;
    }
}
