package com.ll.level0.p181940;

public class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i =0; i<k; i++){
            sb.append(my_string);
        }
        return answer +=sb;
    }public String solution2(String my_string, int k) {
        return my_string.repeat(k);
    }public String solution3(String my_string, int k){
        StringBuilder sb = new StringBuilder();
        while( k > 0){
            sb.append(my_string);
            k--;
        }
        return sb.toString();
    }public String solution4(String my_string, int k){
        String answer = "";
        for(int i=0; i<k; i++){
            answer += my_string;
        }
        return answer;
    }
}
