package com.ll.level0.p181843;

public class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        if (my_string.contains(target)) answer++;
        return answer;
    }
    public int solution2(String my_string, String target) {
        int answer = my_string.contains(target) ? 1:0;
        return answer;
    }
    public int solution3(String my_string, String target) {
        int answer = my_string.length() != my_string.replace(target,"").length() ? 1:0;
        return answer;
    }
    public int solution4(String my_string, String target) {
        int answer = my_string.indexOf(target) == -1? 0:1;
        return answer;
    }
}
