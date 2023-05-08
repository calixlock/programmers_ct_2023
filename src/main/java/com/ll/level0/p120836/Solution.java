package com.ll.level0.p120836;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i == 0) answer+=1;
        }return answer;
    }
    public int solution2(int n) {
        int answer = 0;
        answer = (int)IntStream.rangeClosed(1,n).filter(i->n%i==0).count();
        return answer;
    }
}
