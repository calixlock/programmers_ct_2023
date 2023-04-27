package com.ll.level0.p181879;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        if (num_list.length >10){
            answer = Arrays.stream(num_list).sum();
        }
        else{
            answer = 1;
            for (int i:num_list){
                answer *= i ;
            }
        }
        return answer;
    }
    public int solution2(int[] num_list) {
        return num_list.length>10? Arrays.stream(num_list).sum() : Arrays.stream(num_list).reduce(1,(x,y)->x*y);
    }

}

