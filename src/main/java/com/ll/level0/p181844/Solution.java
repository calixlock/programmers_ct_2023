package com.ll.level0.p181844;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        return IntStream.of(arr)
                .filter(e -> !IntStream.of(delete_list).anyMatch(i -> i == e))
                .toArray();
    }
    public int[] solution2(int[] arr, int[] delete_list){
        int[] answer = {};
        List <Integer> arrList = new ArrayList<>();
        for (int i : arr) {
            arrList.add(i);
        }
//        List<Integer> arrList2 = IntStream.of(arr).boxed().collect(Collectors.toList());
//        List<Integer> arrList3 = Arrays.stream(arr).boxed().collect(Collectors.toList());
//  제거방식1
//        for (int j : del_list) {
//            arrList.remove((Integer) j);
//        }
//  제거방식2
        arrList.removeAll(IntStream.of(delete_list).boxed().collect(Collectors.toList()));
//  List > int[]
        answer=arrList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
    public int[] solution3(int[] arr, int[] delete_list) {
        ArrayList <Integer> arrList = new ArrayList<>();
        for (int i : arr) {
            if (!isExist(i,delete_list)) arrList.add(i);
        }
        int[] answer = new int[arrList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }
        return answer;
    }
    public boolean isExist(int num, int[] arr) {
        for (int e : arr) {
            if(e == num) return true;
        }
        return false;
    }
    public int[] solution4(int[] arr, int[] delete_list) {
        List<Integer> arrList = IntStream.of(arr).boxed().collect(Collectors.toList());
        return arrList.stream()
                .filter(e-> !Arrays.stream(delete_list).anyMatch(del -> del == e))
                .mapToInt(Integer::intValue)
                .toArray();
        }
}
