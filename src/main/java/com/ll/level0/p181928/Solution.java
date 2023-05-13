package com.ll.level0.p181928;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int[] num_list){
        int answer=0;
        String even ="";
        String odd = "";
        for (int num :
                num_list) {
            if(num%2==1) odd += num;
            else even += num;
        }
//        answer = Integer.parseInt(even)+Integer.parseInt(odd); // 11ms
        answer = Integer.valueOf(even)+Integer.valueOf(odd); // 11ms
        return answer;
    }
    public int solution2(int[] num_list){
        return Integer.parseInt(Arrays.stream(num_list)
                .filter(e -> e%2 == 1)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining())) +
                Integer.parseInt(Arrays.stream(num_list)
                        .filter(e -> e%2 != 1)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining()));
    }
}
