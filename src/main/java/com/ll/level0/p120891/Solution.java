package com.ll.level0.p120891;

import java.util.Arrays;

public class Solution {
    public int solution(int order){
        int answer = 0;
        String strOrder = String.valueOf(order);
        for (int i = 0; i < strOrder.length(); i++) {
            if (strOrder.charAt(i) == '3') answer ++;
            if (strOrder.charAt(i) == '6') answer ++;
            if (strOrder.charAt(i) == '9') answer ++;
        }
        return answer;
    }
    public int solution2 (int order) {
        int answer = 0;
        while(order != 0){
            if(order % 10 == 3 ||order % 10 == 6 ||order % 10 == 9 ) answer++;
            order/=10;
        }return answer;
    }
    public  int solution3 (int order){
        return (int) Arrays.stream(String.valueOf(order).split(""))
                .mapToInt(Integer::parseInt)
                .filter(i -> i == 3 || i == 6 || i == 9)
                .count();
    }
}
