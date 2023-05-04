package com.ll.level0.p181835;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int[] arr, int k){
        int[] answer = new int[arr.length];
        if (k%2 != 0) {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i] * k;
            }
        }
        else{
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i] + k;
            }
        }
//        System.out.println(Arrays.toString(answer));
        return answer;
    }
    public int[] solution2(int[] arr, int k){
        for (int i = 0; i < arr.length; i++) {
                   arr[i] = ((k&2)==0)? arr[i]+k : arr[i]*k;
        }
        return arr;
    }
    public int[] solutioin3(int[] arr, int k){
        if (k%2==0) return IntStream.of(arr).map(i->i+k).toArray();
        return IntStream.of(arr).map(i->i*k).toArray();
    }
    public int[] solutioin4(int[] arr, int k){
        return Arrays.stream(arr).map(i -> k % 2 == 0? i+k : i*k).toArray();
    }
}
