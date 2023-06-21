package com.ll.level0.p181924;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;

        for (int i = 0; i < queries.length; i++) {
            answer = swap(answer, queries[i]);
        }
        return answer;
    }
    private int[] swap(int[] arr, int[] idxs){
        int temp = arr[idxs[0]];
        arr[idxs[0]] = arr[idxs[1]];
        arr[idxs[1]] = temp;
        return arr;
    }
    public int[] solution2(int[] arr, int[][] queries) {
        List<Integer> intList= new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            intList.add(arr[i]);
        }
        for (int[] query: queries) {
            Collections.swap(intList,query[0],query[1]);
        }
        return intList.stream()
                .mapToInt(e->e)
                .toArray();
    }

}
