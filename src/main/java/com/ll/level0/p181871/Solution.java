package com.ll.level0.p181871;

import java.util.stream.IntStream;

public class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        while (myString.indexOf(pat) > -1){
                    answer++;
                myString = myString.substring(myString.indexOf(pat)+1);
            }
        return answer;
    }
    public int solution2(String myString, String pat) {
        int answer = 0;
        for(int i=0; i<myString.length(); i++) {
            if(myString.substring(i).startsWith(pat)){
                answer++;
            }
        }
        return answer;
    }
    public int solution3(String myString, String pat) {
        return (int) IntStream.range(0,myString.length())
                .filter(i -> myString.substring(i).startsWith(pat))
                .count();
    }
    //재귀방식
    public int solution4(String myString, String pat) {
        int idx = myString.indexOf(pat);
        return idx == -1 ? 0 : (1 + solution4(myString.substring(idx + 1), pat));
    }
}
