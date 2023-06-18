package com.ll.level0.p181895;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            for (int j = intervals[i][0]; j <= intervals[i][1] ; j++) {
                arrayList.add(arr[j]);
            }
        }
//        int[] answer = new int[arrayList.size()];
//
//        for (int i = 0; i < arrayList.size(); i++) {
//            answer[i] = arrayList.get(i);
//        }
//
//        return answer;
        return arrayList
                .stream()
                .mapToInt(e->e)
                .toArray();
    }
    public int[] solution2(int[] arr, int[][] intervals) {
        return Arrays.stream(intervals)
                .flatMapToInt(e -> Arrays.stream(Arrays.copyOfRange(arr, e[0], e[1] + 1)))
                .toArray();
    }
}
