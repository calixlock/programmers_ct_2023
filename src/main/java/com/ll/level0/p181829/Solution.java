package com.ll.level0.p181829;

import java.util.stream.IntStream;

public class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i + j <= k) answer += board[i][j];
            }
        }
        return answer;
    }

    public static int solution2(int[][] board, int k) {
        return IntStream
                .range(0, board.length)
                .filter(e -> e <= k)
                .map(i -> IntStream
                        .range(0, board[i].length)
                        .filter(j -> j <= k - i)
                        .map(j -> board[i][j])
                        .sum())
                .sum();
    }
}
