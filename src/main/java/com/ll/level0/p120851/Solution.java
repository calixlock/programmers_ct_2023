package com.ll.level0.p120851;

import java.util.Arrays;

public class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[^0-9]", ""); //문자제거
        // method_1
        for (int i = 0; i < my_string.length(); i++) {
            answer += my_string.charAt(i) - '0'; // 문자 > 숫자 변환 및 연산
        }
        // method_2
//        for(char ch : my_string.toCharArray()) {
//            answer += Character.getNumericValue(ch);
//        }

        return answer;
    }
    public int solution2(String my_string){
        int answer = 0;
        return my_string.chars().mapToObj(i -> (char) i).filter(Character::isDigit).map(String::valueOf).mapToInt(Integer::valueOf).sum();
    }
    public int solution3(String my_string) {
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            // digit를 이용해서 10진수 / 숫자 이외 -1반환
            if(Character.digit(my_string.charAt(i),10) >= 0){
                // 문자열을 하나씩 char로 받아내 검사후 char > string > int 변환 및 연산
                answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
            }
        }return answer;
    }
    public int solution4(String my_string){
        int answer=0;
        for (char c :
                my_string.toCharArray()) {
            if (c >= '0' && c <= '9') {
                answer += c-'0';
            }
        }return answer;
    }
}