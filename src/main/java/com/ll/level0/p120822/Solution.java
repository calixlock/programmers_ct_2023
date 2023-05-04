package com.ll.level0.p120822;

import java.sql.Struct;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public String solution(String my_string){
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            answer += my_string.substring(my_string.length()-i-1,my_string.length()-i);
        }
        return answer;
    }
    public String solution2(String my_string){
        String answer = "";
        String[] arr = my_string.split("");
        List<String> stringList = Arrays.stream(arr).collect(Collectors.toList());
        Collections.reverse(stringList);
        answer = stringList.stream().map(String::valueOf).collect(Collectors.joining());
//        for (String word:
//             stringList) {
//            answer+=word;
//        }
        return answer;
    }
    public String solution3(String my_string){
        String answer = "";
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        answer = sb.reverse().toString();
        return answer;
    }
}
