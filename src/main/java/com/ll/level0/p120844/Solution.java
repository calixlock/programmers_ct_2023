package com.ll.level0.p120844;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        answer = new int[numbers.length];

        if (direction.equals("right")){
            for (int i = 0; i < numbers.length; i++) {
                if(i != (numbers.length-1)){
                    answer[i+1] = numbers[i];
                }else{
                    answer[0] = numbers[i];
                }
            }
        }else{
            for (int i = 0; i < numbers.length; i++) {
                if(i != (numbers.length-1)){
                    answer[i] = numbers[i+1];
                }else{
                    answer[i] = numbers[0];
                }
            }
        }
        return answer;
    }
    public int[] solution2(int[] numbers, String direction){
        List<Integer> numList = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toList());
        if (direction.equals("right")){
            numList.add(0, numList.get(numList.size()-1));
            numList.remove(numList.size()-1);
        }else{
            numList.add(numList.size(), numList.get(0));
            numList.remove(0);
        }
        return numList.stream().mapToInt(Integer::intValue).toArray();
    }
}
