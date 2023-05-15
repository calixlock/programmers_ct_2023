package com.ll.level0.p181853;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        return Arrays.stream(num_list)
                .sorted()
                .limit(5)
                .toArray();
    }
    public int[] solution2(int[] num_list) {
        int[] answer = {};
        return Arrays.copyOfRange(num_list,0,5); // Arrays.copyOfRange(원본 배열, 복사할 시작인덱스, 복사할 끝인덱스)
    }
}
