package com.ll.level0.p120821;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length - i - 1];
        }
        return answer;
    }
    public int[] solution2(int[] num_list){
        int[] answer = {};
        List<Integer> intList = Arrays.stream(num_list)
                .boxed()
                .collect(Collectors.toList());
        Collections.reverse(intList);
//        System.out.println(intList);
        answer = intList.stream().mapToInt(Integer::intValue).toArray();
    return answer;
    }

}
