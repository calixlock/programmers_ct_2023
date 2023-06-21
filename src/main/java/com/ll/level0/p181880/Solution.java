package com.ll.level0.p181880;

import java.util.Arrays;

public class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            answer += cal(num_list[i]);
        }
        return answer;
    }
    private int cal(int num){
        int count = 0;
        while (num > 1){
//            if (num % 2 == 0) {
//                num /= 2;
//            }else {
//                num = (num - 1)/2;
//            }
            num /=2;
            count++;
        }
        return count;
    }
    public int solution2(int[] num_list) {
        int answer = 0;
        for (int num: num_list) {
            while (1 < num){
                num /= 2;
                answer ++;
            }
        }return answer;
    }
    public int solution3(int[] num_list) {
        return Arrays.stream(num_list)
                .map(e -> Integer.toBinaryString(e).length()-1)
                .sum();
    }
}
