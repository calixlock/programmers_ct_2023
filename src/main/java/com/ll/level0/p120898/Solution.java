package com.ll.level0.p120898;

public class Solution {
    public int solution(String message) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(message);
        answer = sb.length() * 2;
        return answer;
    }
    public int solution2(String message) {
        int answer =0;
        answer = message.length()*2
        return answer;
    }
    public int solution3(String message){
        String[] arr = message.split("");
        int answer = arr.length *2;
        return answer;
    }
}
