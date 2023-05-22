package com.ll.level0.p181854;

import java.util.Arrays;
import java.util.stream.IntStream;

//정수 배열 arr과 정수 n이 매개변수로 주어집니다.
// arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열을,
// arr의 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열을
// return 하는 solution 함수를 작성해 주세요.
public class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        answer = new int[arr.length];

        if (arr.length % 2 != 0) { //홀수
            for (int i = 0; i < arr.length; i++) {
                answer[i] = i % 2 == 0 ? arr[i] + n : arr[i];
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = i % 2 != 0 ? arr[i] + n : arr[i];
            }
        }
        return answer;
    }

    public int[] solution2(int[] arr, int n) {

        return IntStream.range(0, arr.length)
                .map(i -> arr[i] + ( i%2 == (arr.length%2 == 0? 1 : 0) ? n : 0))
                .toArray();
    }
    public int[] solution3(int[] arr, int n) {
        IntStream.iterate((arr.length+1)%2,e->e<arr.length,e->e+2)
                .forEach(e->arr[e]+=n);
        return arr;
    }
}
