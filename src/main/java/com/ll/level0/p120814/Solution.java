package com.ll.level0.p120814;

public class Solution {
    public int solution(int n){
        int answer = 0;
        int x = n/7; // 피자의 판 수
        int y = n%7; // 피자를 받지 못한 사람 수
        if (y>0) x+=1;
        return answer = x;
    }
    public int solution2(int n){
        return (n+6) / 7;
    }
}
