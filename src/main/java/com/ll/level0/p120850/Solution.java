package com.ll.level0.p120850;

import java.util.Arrays;

public class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        String strNum = my_string.replaceAll("[^0-9]","");
        answer = new int[strNum.length()];
        for (int i = 0; i < strNum.length(); i++) {
            answer[i] = Integer.parseInt(strNum.substring(i,i+1));
        }
        Arrays.sort(answer);
        return answer;
    }
    public int[] solution2(String my_string){
        return Arrays.stream(my_string.replaceAll("[^0-9]","").split(""))
                .sorted()
                .mapToInt(Integer::parseInt)
                .toArray();
    }

}
