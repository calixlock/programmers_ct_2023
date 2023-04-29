package com.ll.level0.p181929;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
    public int solution(int[] num_list) {

//        int multiply_All_Elements = Arrays.stream(num_list)
////                .reduce((x,y)->x*y).getAsInt();
          int multiply_All_Elements = Arrays.stream(num_list)
                .reduce(1,(x,y)->x*y);

          int square_Of_sum_All_Elements = Arrays.stream(num_list)
                  .map(x->x*x).sum();
//        int sum_All_Elements = Arrays.stream(num_list)
//                .sum();
//        int square_Of_sum_All_Elements = (int) Math.pow(sum_All_Elements,2);
//        int answer;
//        if(multiply_All_Elements < square_Of_sum_All_Elements){
//            return 1;
//        }else {return 0;}
       return square_Of_sum_All_Elements > multiply_All_Elements ? 1 : 0;
    }
    public int solution2(int[] num_list){
       int sum = 0;
       int multiple = 0;
       for(int i : num_list){
           sum += i;
           multiple *= i;
       }
        return Math.pow(sum,2) >multiple ? 1:0;
    }
}
