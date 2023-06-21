package com.ll.level0.p181900;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] arr = my_string.split("");
        for (int i = 0; i < indices.length; i++) arr[indices[i]] = "";
        answer = String.join("", arr);
        return answer;
    }

    public String solution2(String myString, int[] indices) {
        return IntStream.range(0, myString.length())
                .filter(i -> !IntStream.of(indices)
                        .boxed()
                        .collect(Collectors.toSet())
                        .contains(i))
                .mapToObj(myString::charAt)
                .map(Object::toString)
                .collect(Collectors.joining());
    }
}
