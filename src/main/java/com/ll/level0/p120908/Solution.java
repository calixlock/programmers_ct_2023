package com.ll.level0.p120908;

public class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        answer = str1.contains(str2) ? 1 : 2; // method_1
//        answer = str1.indexOf(str2) == -1 ? 2: 1; // method_2
//        answer = str1.indexOf(str2) > -1 ? 1: 2; // method_2_2
//

        return answer;
    }
}
