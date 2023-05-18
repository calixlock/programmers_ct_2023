package com.ll.level0.p120845;

public class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
//        for (int i = 0; i < box.length; i++) {
//            answer *= box[i]/n;
//        }
        for (int i :
                box) {
            answer *= i/n;
        }
        return answer;
    }
}
