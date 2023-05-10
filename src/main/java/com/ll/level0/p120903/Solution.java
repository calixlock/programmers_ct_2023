package com.ll.level0.p120903;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String str1:
             s1) {
            for (String str2:
                 s2) {
                if (str1.equals(str2)) answer++;
            }
        }
        return answer;
    }
    public int solution2(String[] s1, String[] s2) {
        int answer = 0;
        Set<String> set1 = new HashSet<>(List.of(s1));
        return (int) Arrays.stream(s2)
                .filter(e -> set1.contains(e)).count();
//        return
//                (int) Arrays.stream(s2)
//                        .filter(set1::contains).count();
    }
}
