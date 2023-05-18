package com.ll.level0.p120910;

public class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        answer = (int) (n * Math.pow(2,t));
        return answer;
    }
    public int solution2(int n, int t){
        int answer = 0;
        answer = n << t; // n * 2^t 계산됨
        return answer;
    }
}
