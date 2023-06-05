package com.ll.level0.p181898;

public class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        for (int i = idx; i < arr.length; i++) {
            System.out.println("idx = "+i);
            if(arr[i] == 1) return 3;
        }
        return -1;
    }
}
