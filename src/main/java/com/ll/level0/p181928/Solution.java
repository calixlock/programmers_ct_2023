package com.ll.level0.p181928;

public class Solution {
    public int solution(int[] num_list){
        int answer=0;
        String even ="";
        String odd = "";
        for (int num :
                num_list) {
            if(num%2==1) odd += num;
            else even += num;
        }
//        answer = Integer.parseInt(even)+Integer.parseInt(odd); // 11ms
        answer = Integer.valueOf(even)+Integer.valueOf(odd); // 11ms
        return answer;
    }
}
