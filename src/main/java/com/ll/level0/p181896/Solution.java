package com.ll.level0.p181896;

public class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for (int num :
                num_list) {
            if(num <0) return answer;
            answer++;
        }
        return -1;
    }
}
