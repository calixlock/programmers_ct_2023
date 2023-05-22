package com.ll.level0.p120905;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        return Arrays.stream(numlist)
                .filter(e->e%n==0)
                .toArray();
    }
    public int[] solution2(int n, int[] numlist) {
        int[] answer = {};
        List<Integer> ansList = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0){ ansList.add(numlist[i]); }
        }
//        answer = ansList.stream()
//                .mapToInt(Integer::intValue)
//                .toArray();
        answer = new int[ansList.size()];
        for (int i = 0; i < ansList.size(); i++) {
            answer[i] = ansList.get(i).intValue();
        }
        return answer;
    }
}
