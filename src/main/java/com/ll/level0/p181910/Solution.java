package com.ll.level0.p181910;

public class Solution {
    public String solution(String my_string, int n) {
//        int ans = my_string.length()-n ;
//        return my_string.substring(ans,my_string.length());
        return my_string.substring(my_string.length()-n);
    }
}
