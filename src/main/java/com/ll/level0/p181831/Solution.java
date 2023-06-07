package com.ll.level0.p181831;

public class Solution {
    public int solution(int[][] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i==j) continue;
                if(arr[i][j] != arr[j][i]) return answer;
            }
        }
        return 1;
    }
}
