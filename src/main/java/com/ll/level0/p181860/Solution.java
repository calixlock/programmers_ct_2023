package com.ll.level0.p181860;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Stream;

public class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        List<Integer> ansList = new ArrayList<>();
        for (int i = 0; i < flag.length; i++) {
            if(flag[i]){
                for (int j = 0; j < arr[i] * 2; j++) {
                    ansList.add(arr[i]);
                }
            }else{
                for (int j = 0; j < arr[i]; j++) {
                    ansList.remove(ansList.size()-1);
                }
            }
        }
        answer = ansList.stream()
                .mapToInt(e->e)
//                .mapToInt(Integer::intValue)
                .toArray();
       return answer;
    }
    public int[] solution2(int[] arr, boolean[] flag) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) stack.push(arr[i]);
            } else {
                for (int j = 0; j < arr[i]; j++) stack.pop();
            }
        }
        int[] answer = stack.stream()
                .mapToInt(e -> e)
//                .mapToInt(Integer::intValue)
                .toArray();
        return answer;
    } // List가 더 빠르다.
    public int[] solution3(int[]arr, boolean[]flag){
        String ans= "";
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                ans += String.valueOf(arr[i]).repeat(arr[i] * 2);
            } else {
                ans = ans.substring(0, ans.length() - arr[i]);
            }
        }return Arrays.stream(ans.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
//        return Stream.of(ans.split(""))
//                .mapToInt(Integer::parseInt)
//                .toArray();
    }

}
