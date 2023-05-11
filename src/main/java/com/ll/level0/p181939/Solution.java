package com.ll.level0.p181939;

public class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str_ab = Integer.toString(a) + Integer.toString(b);
//        String str_ab = ""+a+b
        String str_ba = Integer.toString(b) + Integer.toString(a);
//        String str_ba = ""+b+a
        int ab = Integer.parseInt(str_ab);
        int ba = Integer.parseInt(str_ba);
        return ab >= ba ? ab : ba;
    }

    public int solution2(int a, int b) { // 2방식 오래걸림
        int ab = Integer.parseInt("" + a + b);
        int ba = Integer.parseInt("" + b + a);
        return Math.max(ab, ba);

    }
}
