package com.ll.level0.p181849;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {
    public int solution(String num_str) {
        int answer = 0;
        char[] num_arr = num_str.toCharArray();
        for (char num :
                num_arr) {
            //method 1
            answer += Character.getNumericValue(num); // char > int 치환
            //method 2
            answer += ((int) num - '0'); // ascii code 연산
        }
        return answer;
    }

    public int solution2(String num_str) {
        int answer = 0;
        for (int i = 0; i < num_str.length(); i++) {
            char num_char = num_str.charAt(i);
            answer += Character.getNumericValue(num_char);
        }
        return answer;
    }

    public int solution3(String num_str) {
        int answer = 0;
        String[] numArr = num_str.split("");
        for (String num :
                numArr) {
            answer += Integer.parseInt(num);
        }
        return answer;
    }

    public int solution4(String num_str) {
        return Stream.of(num_str.split(""))
//           return Arrays.stream(num_str.split(""))
//                .mapToInt(e -> Integer.parseInt(e))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
