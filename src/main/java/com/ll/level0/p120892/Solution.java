package com.ll.level0.p120892;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public String solution(String cipher, int code){
        String answer="";
        StringBuilder sb = new StringBuilder();
//        char[] arrCipher = cipher.toCharArray();
        String[] arrCipher = cipher.split("");
        for (int i = 0; i < arrCipher.length; i++) {
            if ((i+1) % code == 0){
                sb.append(arrCipher[i]);
            }
        }
        return sb.toString();
    }
    public String solution2(String cipher,int code){
        String answer="";
        for(int i=code-1; i<cipher.length(); i+=code){
            answer += cipher.substring(i,i+1);
        }
        return answer;
    }
    public String solution3(String cipher, int code){
        return IntStream.range(0,cipher.length())
                .filter(e -> e%code==code -1)
                .mapToObj(i -> String.valueOf(cipher.charAt(i)))
                .collect(Collectors.joining());
    }
}
