package com.ll.level0.p181867;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(String myString) {
        int[] answer = Arrays
//                .stream(myString.split("x",-1))
                .stream(myString.split("x",myString.length()))
                .mapToInt(e->e.length())
                .toArray();
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
        System.out.println( Arrays.toString(myString.split("x",-1)));
        return answer;
    }
    public int[] solution2(String myString) {
        String[] arrStr = myString.split("x",-1);
        int[] answer = new int[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            answer[i] = (arrStr[i].length());
        }
        return answer;
    }
}
