package com.ll.level0.p120909;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        double sqrt_n = Math.sqrt(n);
        if(sqrt_n == (int)sqrt_n){
            return 1;
        }else return 2;
    }
    public int solution2(int n) {
//        if (n % Math.sqrt(n) == 0){
//            return 1;
//        }else return 2;
//    }
        return n % Math.sqrt(n) == 0 ? 1 : 2;
    }
}
