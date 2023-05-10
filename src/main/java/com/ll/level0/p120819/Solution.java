package com.ll.level0.p120819;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money / 5500;
        answer[1] = money % 5500;
        return answer;
    }
    public int[] solution2(int money){
        List<Integer> moneyList = new ArrayList<>();
        moneyList.add(money/5500);
        moneyList.add(money%5500);
        int[] answer = moneyList.stream()
                .mapToInt(i->Integer.valueOf(i))
//                .mapToInt(Integer::intValue)
//                .mapToInt(i -> i)
                .toArray();
        return answer;
    }
}
