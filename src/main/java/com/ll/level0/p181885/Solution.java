package com.ll.level0.p181885;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        List<String> falseList = new ArrayList<>();
        for (int i = 0; i < todo_list.length; i++) {
            if (finished[i] == false){
                falseList.add(todo_list[i]);
            }
        }
        answer = falseList.toArray(String[]::new);
        return answer;
    }
}
