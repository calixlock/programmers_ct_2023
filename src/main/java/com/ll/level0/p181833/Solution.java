package com.ll.level0.p181833;

public class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
//                if(i == j) answer[i][j] = 1;
//                else answer[i][j] = 0;
                answer[i][j] = i==j ? 1 :0;
            }
        }
        return answer;
    }
    public int[][] solution2(int n) {
        int[][] answer = new int[n][n];
        for(int i = 0 ; i < n ; i++) {
            answer[i][i] = 1;
        }
        return answer;
    }
}
