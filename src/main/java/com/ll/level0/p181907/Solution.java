package com.ll.level0.p181907;

import java.util.Arrays;

public class Solution {
    public String solution(String my_string, int n) {
        String answer = my_string.substring(0,n);
        return answer;
    }
    public String solution2(String my_string, int n){
        String answer="";
        StringBuilder sb = new StringBuilder();
        String[] arr = my_string.split("");
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]);
        }
        return answer = sb.toString();
    }
    public String solution3(String my_string, int n){
        String answer="";
        String[] arr = my_string.split("");
        for (int i = 0; i < n; i++) {
            answer+=arr[i];
        }
        return answer;
    }
}
