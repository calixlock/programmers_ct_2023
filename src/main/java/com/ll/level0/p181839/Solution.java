package com.ll.level0.p181839;

public class Solution {
    public int solution(int a, int b){
        int answer =0;
        if (a%2==1 && b%2==1) return answer = a*a+b*b; //(int)Math.pow(a,2)+(int)Math.pow(b,2)
        else if(a%2==1 || b%2==1) return answer = 2*(a+b);
        else return a-b>0?a-b:b-a;
//        else return (int)(Math.abs(a-b));
//
    }
}
