package com.ll.level0.p120583;

import java.util.Arrays;

public class Solution {
    public int solution(int[] arr, int n){
        int answer = 0;
        int beforeArrLength = arr.length;
        int afterArrLength = Arrays.stream(arr)
                .filter(i -> i != n).toArray().length;
        answer = beforeArrLength - afterArrLength;
        return answer;
    }
    public int solution2(int[] arr, int n){
        int answer = 0;
        for (int num:
             arr) {
            if (num == n) answer++;
        }
        return answer;
    }
    public int solution3(int[] arr, int n){
        int answer = 0;
        for (int e :
                arr) {
            answer += e == n ? 1 : 0;
        }
        return  answer;
    }
    public int solution4(int[] arr, int n){
        int answer = 0;
        answer = (int) Arrays.stream(arr)
                .filter(e -> e == n)
                .count();
        return answer;
    }
}
