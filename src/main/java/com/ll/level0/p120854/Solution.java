package com.ll.level0.p120854;

import java.util.Arrays;

public class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = {};
        answer = new int[strlist.length];
        int i = 0;
        for (String str :
                strlist) {
            answer[i++] = str.length();
        }
//        return Arrays.toString(answer);
        return answer;
    }

    public int[] solution2(String[] strlist) {
        int[] answer = Arrays.stream(strlist).mapToInt(String::length).toArray();
        return answer;
    }

    public int[] solution3(String[] strlist) {
        int[] answer = Arrays.stream(strlist).map(e -> e.length()).mapToInt(Integer::valueOf).toArray();
        return answer;
    }
}
