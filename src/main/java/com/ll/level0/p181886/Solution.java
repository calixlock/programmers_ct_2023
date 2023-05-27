package com.ll.level0.p181886;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1];
        int j = 0;
//        for (int i = 0;i < names.length;i+=5) {
        for (int i = 0; i < names.length; i++) {
            if( i % 5 == 0) answer[j++] = names[i];
        }
        return answer;
    }
    public String[] solution2(String[] names) {
        List<String> answer = new ArrayList<>();
        for(int i=0; i<names.length; i++){
            if(i % 5 == 0) answer.add(names[i]);
        }
        return answer.toArray(String[]::new);
    }
}
