package com.ll.level0.p181887;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int odd = 0;
        int even = 0;
        for (int i = 0; i < num_list.length; i++) {
            if(i%2==0){ odd+=num_list[i]; }
            else { even+=num_list[i]; }
        }
        answer = odd >= even? odd : even;
        return answer;
    }
    public int solution2(int[] num_list) {
        int odd = IntStream.iterate(0, i-> i < num_list.length, i->i+2)
                .map(i->num_list[i])
                .sum();
        int even = IntStream.iterate(1, i-> i < num_list.length, i->i+2)
                .map(i->num_list[i])
                .sum();
        int answer = odd >= even ? odd : even;
        return answer;
    }
}
