package com.ll.level0.p181878;

public class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        return myString.toLowerCase().contains(pat.toLowerCase())? 1 : 0;
    }
    public int solution2(String myString, String pat) {
        int answer = 0;
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        return myString.indexOf(pat) == -1? 0 : 1;
    }
}
