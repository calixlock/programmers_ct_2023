package com.ll.level0.p120806;
public class Solution {
    public int solution(int n1, int n2){
        double ans = (double) n1 / (double) n2;
        return (int) (ans*1000);
    }
    public int solution2(int num1, int num2) {
        int answer = (num1*1000) / num2;
        return answer;
    }
}
