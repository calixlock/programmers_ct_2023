package com.ll.level0.p181888;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> lit = new ArrayList<>();
        int i = 0;
        while(num_list.length > n*i){
            lit.add(num_list[n*i]);
            i++;
        }
        int[] answer = new int[lit.size()];
        for (int j = 0; j < lit.size(); j++) {
            answer[j] = lit.get(j);
        }
        return answer;
    }
    public int[] solution2(int[] num_list, int n) {
        ArrayList<Integer> lit = new ArrayList<>();
        for (int i = 0; i < num_list.length;) {
            lit.add(num_list[i]);
            i+=n;
        }
        return lit.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
    public int[] solution3(int[] num_list, int n) {
        List <Integer> lit = new ArrayList<>();
        for(int i =0; i<num_list.length; i++){
            if(i % n == 0)lit.add(num_list[i]);
        }
        return lit.stream().mapToInt(Integer::intValue).toArray();
    }
}
