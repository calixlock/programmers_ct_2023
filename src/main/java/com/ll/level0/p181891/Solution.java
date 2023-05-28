package com.ll.level0.p181891;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int j = 0;
//        List<Integer> tempList = new ArrayList<>();
        for (int i = n; i <num_list.length ; i++) {
            answer[j++] = num_list[i];
        }
        for (int i = 0; i < n; i++) {
            answer[j++] = num_list[i];
        }
        return answer;
    }
    public int[] solution2(int[] num_list, int n){
        return IntStream.range(0,num_list.length)
                .map(e->num_list[(e+n)%num_list.length])
                .toArray();
    }
}
