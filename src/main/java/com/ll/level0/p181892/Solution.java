package com.ll.level0.p181892;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length-n+1];
        int j = 0;
        for (int i = n-1; i <num_list.length ; i++) {
                    answer[j++] = num_list[i];
        }
        return answer;
    }
    public int[] solution2(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list,n-1,num_list.length);
    }
}
