package com.ll.level0.p120888;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public String solution(String my_string) {
        String answer = "";
        answer = Arrays.stream(my_string.split(""))
                .distinct()
                .collect(Collectors.joining());
        return answer;
    }
    public String solution2(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for (char c :
                my_string.toCharArray()) {
            if(set.add(c)) sb.append(c);
        }
        answer = sb.toString();
        return answer;
    }
    public String solution3(String my_string) {
        String[] arr = my_string.split("");
        LinkedHashSet set = new LinkedHashSet<>(Arrays.asList(arr));
        return String.join("",set);

    }
}
