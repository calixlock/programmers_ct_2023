package com.ll.level0.p120824;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int[] num_list){
        int[] answer = {};
        answer = new int[2];
        int odd_count = 0;
        int even_count = 0;
        for (int num:
                num_list) {
            if(num % 2 == 0)  even_count++;
            else odd_count++;
        }
        answer[0] = even_count;
        answer[1] = odd_count;
        return answer;
    }
    public int[] solution2(int[] num_list){
        int[] answer = new int[2];
        for (int num :
                num_list) {
            answer[num % 2]++;
        }
        return answer;
    }
    public int[] solution3(int[] num_list){
        return IntStream.of((int) Arrays.stream(num_list).filter(i->i%2==0).count(), (int) Arrays.stream(num_list).filter(i->i%2==1).count()).toArray();
    }
}
