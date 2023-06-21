package com.ll.level0.p181872;

public class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        answer = myString.substring(0,myString.lastIndexOf(pat)+pat.length());
//        answer = myString.substring(0, myString.lastIndexOf(pat)g) + pat;
        return answer;
    }
}
