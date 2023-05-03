package com.ll.level0.p181889;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
//        for(int i = 0; i<n; i++){
        for(int i = 0; i< answer.length; i++){
            answer[i] = num_list[i];
        }
        return answer;
    }
    // Arrays.copyOfRange(원본 배열, 복사할 시작인덱스, 복사할 끝인덱스) 인덱스는 0부터 시작하는것 기준
    public int[] solution2(int[] num_list, int n) {
        int[] answer = {};
        answer = Arrays.copyOfRange(num_list,0,2);
        return answer;
    }
    public int[] solution3(int[] num_list, int n) {
        return Arrays.stream(num_list).limit(n).toArray();
    }
    public Integer[] solution4(int[] num_list, int n){
        return Arrays.stream(num_list).boxed().limit(n).toArray(Integer[]::new);
    }
}
