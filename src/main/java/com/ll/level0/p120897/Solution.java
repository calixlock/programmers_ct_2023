package com.ll.level0.p120897;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> numList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(n%i == 0) numList.add(i);
        }
//        answer = new int[numList.size()];
//        for (int i = 0; i < answer.length; i++) {
//            answer[i]=numList.get(i);
//        }
        answer = numList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return answer;
    }
    public int[] solution2(int n){
        return IntStream.rangeClosed(1,n)
                .filter(e-> n % e == 0)
                .toArray();
    }
}
