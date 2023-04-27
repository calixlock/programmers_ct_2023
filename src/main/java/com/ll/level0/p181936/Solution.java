package com.ll.level0.p181936;

public class Solution {
     public int solution(int number, int n, int m) {
         int answer = 0;
         if((number % n == 0) && (number % m == 0)){
             answer = 1;
         }
         return answer;
     }
    public int solution2(int number, int n, int m) {
        return number % n == 0 && number % m ==0 ? 1:0;
    }
}
