package com.ll.level0.p181874;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

import static java.util.stream.Nodes.collect;

public class Solution {
    public String solution(String myString) {
        String answer = "";
        String[] strList = myString.split("");
        for (String str:
            strList ) {
            answer += str.equals("a")||str.equals("A") ? "A": str.toLowerCase();
        }
        return answer;
    }
    public String solution2(String myString) {
        String answer = "";
        answer = myString.toLowerCase().replace("a","A");
        return answer;
    }
    public String solution4(String myString) {
        String answer = myString.chars()
                .mapToObj(c -> (char) c)
                .map(Character::toLowerCase)
                .map(c -> c.equals('a') ? 'A' : c)
                .map(String::valueOf)
                .collect(Collectors.joining());

        return answer;
    }
}
