package com.ll.level0.p181866;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        Arrays.sort(answer);

        // 빈문자열 솎아내기
        List<String> ansList = new ArrayList<>();
        for (int i = 0; i < answer.length; i++) {
            if (answer[i].length() != 0) {
                ansList.add(answer[i]);
            }
        }
//        System.out.println("answer = " + ansList);
        return ansList.stream()
                .toArray(String[]::new);
    }
    public String[] solution2(String myString) {
        return Arrays.
                stream(myString.split("x"))
//                .filter(e -> !e.isEmpty())
                .filter(str->str.length()>0)
                .sorted()
                .toArray(String[]::new);
    }
}
