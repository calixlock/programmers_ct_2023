package com.ll.level0.p120813;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int n) {
        int[] answer = {};
//        return answer;
        return IntStream.range(1,n+1)
                .filter(e->e%2!=0)
                .toArray();
    }
    public int[] solution2(int n) {
//        int len = (n+1)/2;
        int[] answer = new int[(n+1)/2];
        int j = 0;
        for (int i = 1; i <=n; i++) {
            if( i%2 !=0 ) answer[j++]=i;
        }
        return answer;
    }
}
