package com.ll.level0.p181930;

public class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        answer = a+b+c;
        if(a==b&&b==c) return answer*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
        if((a!=b) && (a!=c) && (b!=c)) return answer;
        if((a==b) || (b==c) || (a==c)) return answer*(a*a+b*b+c*c);
        return answer;
    }
}
