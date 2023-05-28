package com.ll.level0.p181942;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        for (int i = 0; i <str1.length(); i++) {
//            answer += str1.substring(i,i+1) + str2.substring(i,i+1);
            answer += str1.charAt(i)+""+ str2.charAt(i);
        }
        return answer;
    }
    public String solution2(String str1, String str2) {
        String answer = "";
        String[] s1 = str1.split("");
        String[] s2 = str2.split("");
        for (int i = 0; i <str1.length(); i++) {
            answer += s1[i]+s2[i];
        }
        return answer;
    }
    public String solution3(String str1, String str2) {
        return IntStream.range(0, str1.length())
                .mapToObj(i -> Character.toString(str1.charAt(i)) + str2.charAt(i))
                .collect(Collectors.joining());
    }
}
