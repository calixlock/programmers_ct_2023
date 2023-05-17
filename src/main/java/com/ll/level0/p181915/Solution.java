package com.ll.level0.p181915;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        for (int index:
             index_list) {
            answer+=my_string.charAt(index);
        }
        return answer;
    }
    public String solution2(String my_string, int[] index_list){
        return Arrays.stream(index_list)
                .mapToObj(e->String.valueOf(my_string.charAt(e)))
                .collect(Collectors.joining());
    }
    public String solution3(String my_string, int[] index_list) {
        String answer = "";
        String[] arrString = my_string.split("");
        for(int index : index_list) {
            answer += arrString[index];
        }
        return answer;
    }
    public String solution4(String my_string, int[] index_list){
        StringBuilder sb = new StringBuilder();
        for (int index :
                index_list) {
            sb.append(my_string.charAt(index));
        }
        return sb.toString();
    }
}
