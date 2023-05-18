package com.ll.level0.p181908;

public class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        answer = my_string.endsWith(is_suffix)?1:0;
        return answer;
    }
    public int solution2(String my_string, String is_suffix){
        int answer = 0;
        String strRev = new StringBuilder(my_string).reverse().toString();
        String sufRev = new StringBuilder(is_suffix).reverse().toString();
        answer = strRev.indexOf(sufRev) == 0? 1:0;
        return answer;
    }
    public int solution3(String my_string, String is_suffix) {
        int answer = 0;
        if (!my_string.contains(is_suffix)) return 0;
        return (my_string.lastIndexOf(is_suffix) == (my_string.length() - is_suffix.length())) ? 1 : 0;
    }
}
