package com.ll.level0.p181861;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int[] solution(int[] arr) {
        int ansLen = 0;
        for (int n : arr) { ansLen += n; }
        int[] answer = new int[ansLen];
        int i = 0;
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr[j]; k++) {
                    answer[i++] = arr[j];
                }
            }
        return answer;
    }
    public List<Integer> solution2(int[] arr){
        return Arrays.stream(arr)
                .boxed()
                .flatMap(e -> Collections.nCopies(e,e).stream())
                .collect(Collectors.toList());
    }
    public int[] solution3(int[] arr){
        ArrayList<Integer> ansList =new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                ansList.add(arr[i]);
            }
        }
        return ansList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
