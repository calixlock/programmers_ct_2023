package com.ll.level0.p120895;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] strArr = my_string.split("");
        String temp1 = strArr[num1];
        strArr[num1] = strArr[num2];
        strArr[num2] = temp1;
//        for (int i = 0; i < my_string.length(); i++) {
//            answer += strArr[i];
//        }
        answer= String.join("",strArr);
        return answer;
    }
    public String solution2(String my_string, int n1, int n2){
        List<String> strList = Arrays.stream(my_string.split(""))
                .collect(Collectors.toList());
        Collections.swap(strList,n1,n2);
        return String.join("",strList);
    }
}
