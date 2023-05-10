package com.ll.level0.p120825;

public class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
    public String solution2(String my_string, int n){
        String answer="";
        for (char str :
                my_string.toCharArray()) {
            for (int i = 0; i <n; i++) {
                answer+=str;
            }
        }return answer;
    }
    public String solution3(String my_string, int n) {
        String answer = "";
        for (char str :
                my_string.toCharArray().) {
            for (int i = 0; i <n; i++) {
                answer += (""+str).repeat(n);
            }
        }return answer;
    }
}
