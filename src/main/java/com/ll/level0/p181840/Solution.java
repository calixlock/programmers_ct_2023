package com.ll.level0.p181840;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for (int i:
             num_list) {
            if(i==n){
                answer = 1;
            }
        }
        return answer;
    }
    public int solution2(int[] num_list, int n){
        int answer = 0;
        answer = IntStream.of(num_list).anyMatch(e->e==n) ? 1:0;
        return answer;

    }
    public int solution3(int[] num_list, int n) {
        long cnt = Arrays.stream(num_list).filter(f -> f == n).count();

        return cnt > 0 ? 1 : 0;
    }

}
