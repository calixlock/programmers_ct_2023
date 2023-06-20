package com.ll.level0.p181912;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        int temp = 0;
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < intStrs.length; i++) {
            temp = Integer.parseInt(intStrs[i].substring(s,s+l));
            if(temp > k) numList.add(temp);
        }
        answer = numList.stream().mapToInt(e->e).toArray();
        return answer;
    }
    public int[] solution2(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < intStrs.length; i++) {
            numList.add(Integer.parseInt(intStrs[i].substring(s, s + l)));

        }
        return numList.stream()
                .filter(e -> e>k)
                .mapToInt(e->e)
                .toArray();
    }
    public int[] solution3(String[] intStrs, int k, int s, int l) {
        return Arrays.stream(intStrs)
                .mapToInt(e ->Integer.parseInt(e.substring(s,s+l)))
                .filter(e->e>k)
                .toArray();
    }
}
