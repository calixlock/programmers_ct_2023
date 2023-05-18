package com.ll.level0.p120893;

import java.util.stream.Collectors;

public class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isUpperCase(my_string.charAt(i))) answer += my_string.substring(i,i+1).toLowerCase();
//            else answer += my_string.substring(i,i+1).toUpperCase();
            else answer += String.valueOf(my_string.charAt(i)).toUpperCase();
        }
        return answer;
    }
    public String solution2(String my_string) {
        return my_string.chars()
                .mapToObj(e -> String.valueOf((char) (Character.isLowerCase(e) ? Character.toUpperCase(e) : Character.toLowerCase(e))))
                .collect(Collectors.joining());
    }
}
