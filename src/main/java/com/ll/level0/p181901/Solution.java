package com.ll.level0.p181901;

import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int n, int k) {
        int lenList = n/k;
        int[] answer = new int[lenList];
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if(i%k==0) answer[j++]=i;
        }
        return answer;
    }
    public int[] solution2(int n, int k){
        return IntStream.rangeClosed(1,n)
                .filter(e->e%k==0).toArray();
    }
}
