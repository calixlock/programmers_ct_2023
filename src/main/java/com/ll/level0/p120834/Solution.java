package com.ll.level0.p120834;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public String solution(int age) {
        String answer = "";
        int a = 0;
        while(age > 0) {
           answer = (char) ((age % 10) + 97) + answer;
           age /= 10;
        }
        return answer;
    }
    public String solution2(int age){
        return String.valueOf(age)
                .chars()
                .mapToObj(e->String.valueOf((char) (49+e)))
                .collect(Collectors.joining());
    }
    public String solution3(int age){
        StringBuilder sb = new StringBuilder();
        while(age>0){
            sb.insert(0,(char)((age%10) + (int)'a'));
            age /=10;
        }return sb.toString();
    }
}
