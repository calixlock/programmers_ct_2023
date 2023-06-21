package com.ll.level0.p181838;

import java.util.Arrays;

public class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        for (int i = 0; i < date1.length; i++) {
            if (date1[i] < date2[i]) return 1;
            else if (date1[i] > date2[i]) return 0;
        }
        return answer;
    }
    public int solution2(int[] date1, int[] date2) {
        return Arrays.compare(date1, date2) < 0 ?
    }
}
