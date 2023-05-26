package com.ll.level0.p181834;

import java.util.Arrays;
import java.util.Objects;
import java.util.SimpleTimeZone;
import java.util.stream.Collectors;

public class Solution {
    public String solution(String myString) {
        String answer = "";
        int c;
        for (int i = 0; i < myString.length(); i++) {
            c = (int) myString.substring(i, i + 1).charAt(0);
            if (c <= (int) 'l') {
                answer += 'l';
            } else {
                answer += (char) c;
            }
        }
        return answer;
    }
    public String solution2(String myString){
        return myString.chars()
                .mapToObj(e -> (int)e <=(int)'l'? 'l':e)
                .map(Objects::toString)
                .collect(Collectors.joining());
    }
    public String solution3(String myString){
        String answer = "";
        for (String str: myString.split("")) {
            if(str.charAt(0) <= 'l'){
                answer+='l';
            }else{
                answer+=str;
            }
        }return answer;
    }
    public String solution4(String myString){
        return myString.replaceAll("[^l-z]","l");
    }
    public String solution5(String myString){
        return myString.chars()
                .mapToObj(e -> Character.toString(Integer.max(e,'l')))
//                .mapToObj(e -> Integer.max(e,'l'))
//                .map(Objects::toString)
                .collect(Collectors.joining());
    }
    public String solution6(String myString) {
        String answer = "";
        int a = 'l' - 'a';

        for (char c : myString.toCharArray()) {
            if (c - 'a' < a) {
                answer += 'l';
            } else {
                answer += c;
            }
        }
        return answer;
    }
}
