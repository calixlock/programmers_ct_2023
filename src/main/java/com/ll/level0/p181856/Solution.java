package com.ll.level0.p181856;

import java.util.stream.IntStream;

public class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sumArr1 = 0;
        int sumArr2 = 0;
        if (arr1.length > arr2.length){ return 1; }
        else if (arr2.length > arr1.length) { return -1; }
        else {
            for (int i = 0; i <arr1.length; i++) {
                    sumArr1 += arr1[i];
                    sumArr2 += arr2[i];
            }
            return sumArr1>sumArr2 ? 1 : sumArr2>sumArr1? -1 : 0;
        }
    }
    public int solution2(int[] arr1,int[] arr2){
        int answer = 0;
        answer = Integer.compare(arr1.length,arr2.length);
        if (answer==0){
            answer = Integer.compare(IntStream.of(arr1).sum(),IntStream.of(arr2).sum());
        }
        return answer;
    }
}
