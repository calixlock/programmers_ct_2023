package com.ll.level0.p181933;

public class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if (flag == true){
            answer = a+b;
        }else{
            answer = a-b;
        }
        return answer;
    }
    public int solution2(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }
}
