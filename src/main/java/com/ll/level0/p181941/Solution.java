package com.ll.level0.p181941;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public String solution(String[] arr) {
        String txt="";
        for (String t : arr){
            txt += t;
        }return txt;
    }
    public String solution2(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for (String t : arr){
            sb.append(t);
        }return sb.toString();
    }
    public String solution3(String[] arr) {
        return Arrays.stream(arr)
                .collect(Collectors.joining());
//        return Stream.of(arr)
//                .collect(Collectors.joining());
    }
}
