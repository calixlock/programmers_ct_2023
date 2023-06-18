package com.ll.level0.p181938;

public class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int tmp1 = Integer.parseInt(a+""+b);
        int tmp2 = 2*a*b;
        answer = tmp1>=tmp2 ? tmp1 : tmp2;
        return answer;
    }
    public int solution2(int a, int b){
        return Math.max(Integer.parseInt(a+""+b),2*a*b);
    }
}
