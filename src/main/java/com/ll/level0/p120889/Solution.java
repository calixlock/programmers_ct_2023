package com.ll.level0.p120889;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {
    public int solution(int[] sides){
        int answer = 0;
        int n1 = Arrays.stream(sides).sorted().limit(2).sum();
        int maxValue = Arrays.stream(sides).sorted().limit(3).sum() - n1;
        answer = maxValue < n1 ? 1: 2;
        return answer;
    }
    public int solution2(int[] sides){
        int answer = 0;
        Arrays.sort(sides);
        return  sides[2] >= sides[0]+sides[1] ? 2 : 1;
    }
}
