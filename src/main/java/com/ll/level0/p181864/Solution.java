package com.ll.level0.p181864;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public int solution (String myString, String pat){
        int answer = 0;
        String[] strArr = myString.split("");
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = strArr[i].equals("A")?"B":"A";
        }
        myString = String.join("",strArr);
        answer = myString.contains(pat)?1:0;
        System.out.println(myString);
        return answer;
    }
    public int solution2 (String myString, String pat){
        int answer = 0;
        String myString2 = "";
        for (int i = 0; i < myString.length(); i++) {
            myString2 += myString.substring(i,i+1).equals("A")?"B":"A";
        }
        answer = myString2.contains(pat)? 1 : 0;
        return answer;
    }
    public int solution3 (String myString, String pat){
        return myString.contains(Stream.of(pat.split(""))
                .map(e -> "A".equals(e)?"B":"A")
                .collect(Collectors.joining()))? 1 : 0 ;

    }
}
