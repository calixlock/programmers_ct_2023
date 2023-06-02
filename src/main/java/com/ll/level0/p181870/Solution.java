package com.ll.level0.p181870;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public String[] solution(String[] strArr) {
        return Arrays.stream(strArr)
                .filter(i -> !i.contains("ad"))
                .toArray(String[]::new);
    }
}
