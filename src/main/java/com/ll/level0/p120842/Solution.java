package com.ll.level0.p120842;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = {};
        int idx = 0;
        answer = new int[num_list.length / n][n];
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                answer[i][j] = num_list[idx++];
            }
        }
        return answer;
    }

    public int[][] solution2(int[] num_list, int n) {
        int[][] answer;
        answer = new int[num_list.length / n][n];
        for (int i = 0; i < num_list.length; i++) {
            answer[i / n][i % n] = num_list[i];
        }
        return answer;
    }

    public int[][] solution3(int[] num_list, int n) {
        int[][] answer;
        answer = new int[num_list.length / n][n];
        int idx = 0;
        for (int i = 0; i < num_list.length; i += n) {
            int[] arrTemp = Arrays.copyOfRange(num_list, i, i + n);
            answer[idx++] = arrTemp;
        }
        return answer;
    }
    public int[][] solution4(int[] num_list, int n) {
        return IntStream.range(0,num_list.length / n)
                .mapToObj(e -> IntStream.range(0,n)
                        .map(i -> num_list[e*n + i])
                        .toArray())
                .toArray(int[][]::new);
    }

}
