package com.ll.level0.p181883;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};

        int idx = 0;
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
//                arr[j] +=1;
                arr[j]++;
            }
        }
        return arr;
    }
    public int[] solution2(int[] arr, int[][] queries) {
        Arrays.stream(queries)
                .forEach(e -> IntStream.rangeClosed(e[0], e[1])
                    .forEach(i->arr[i]++));
        return arr;
    }
}
