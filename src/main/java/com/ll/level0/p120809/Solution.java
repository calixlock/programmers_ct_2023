package com.ll.level0.p120809;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int[] numbers){
        int[] answer = {};
        Arrays.stream(numbers).map(i->i*2).toArray();
        return Arrays.stream(numbers).map(i->i*2).toArray();
    }
    public int[] solution2(int[] numbers){
        int[] answer ={};
        answer = new int[numbers.length];
        int i = 0;
        for (int num:
             numbers) {
            answer[i++]= num*2;
        }
        return answer;
    }
    public ArrayList solution3(int[] numbers) {
    ArrayList<Integer> answer = new ArrayList<>();
        for (int num :
                numbers) {  answer.add(num*2);
        }
    return answer;
    }
    public int[] solution4(int[] numbers){
        for(int i=0; i<numbers.length;i++)numbers[i] *= 2;
        return numbers;
    }
}
