package com.ll.level0.p181919;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> arrList = new ArrayList<>();

        arrList.add(n);
        while (n != 1){
            if(n % 2 == 0) {
                n /= 2;
//                arrList.add(n);
            }else {
                n = n * 3 + 1;
//                arrList.add(n);
            }
            arrList.add(n);
        }
        answer = arrList.stream()
//                .mapToInt(e->e)
                .mapToInt(Integer::intValue)
                .toArray();
            return answer;
    }
    public int[] solution2(int n) {
        List<Integer> arrList = new ArrayList<>();
        while(n != 1) {
            arrList.add(n);
            n = n % 2 == 0 ? n / 2 : 3 * n + 1;
        }
        arrList.add(1);
        return arrList.stream().mapToInt(Integer::intValue).toArray();
    }
}
