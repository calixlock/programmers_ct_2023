package com.ll.level0.p120904;

public class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String str_k = ""+k;
        String strNum = ""+ num;
        for (int i = 0; i < strNum.length(); i++) {
            if (strNum.substring(i,i+1).equals(str_k)) return i+1;
        }
        return answer;
    }
    public int Solution2(int num, int k){
//        int answer = (" "+num).indexOf(k+"");
//        return answer == -1 ? -1 : answer;
        return (" "+num).indexOf(String.valueOf(k));
    }
}
