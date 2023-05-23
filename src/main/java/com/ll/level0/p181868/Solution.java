package com.ll.level0.p181868;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

//단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때,
// my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을
// return 하는 solution 함수를 작성해 주세요.
public class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        List<String> ansList = Arrays.stream(my_string.split(" "))
                .collect(Collectors.toList());
        ansList.removeAll(Arrays.asList(""));
        answer = ansList.toArray(new String[ansList.size()]);
        return answer;
    }
    public String[] solution2(String my_string){
        String[] answer ={};
//        answer = my_string.trim().split("[ ]+");
        answer = my_string.trim().split("\\s+");
        return answer;

    }
}
