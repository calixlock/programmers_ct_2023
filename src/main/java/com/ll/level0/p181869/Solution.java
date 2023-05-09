package com.ll.level0.p181869;

import java.util.Arrays;

public class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        return answer;
    }
    public String[] solution2(String my_string){
        return Arrays.stream(my_string.split(" ")).toArray(String[]::new);
    }
}
