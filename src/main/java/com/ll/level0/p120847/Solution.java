package com.ll.level0.p120847;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
    public int solution(int[] numbers){
        int answer = 0;
//        Arrays.sort(numbers); // 자체 리스트를 정렬하는 방식
        int[] sortArr = IntStream.of(numbers).sorted().toArray();
        answer = sortArr[sortArr.length-1]*sortArr[sortArr.length-2];
        return answer;
    }
    public int solution2(int[] numbers){
        int answer=0;
        answer = Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(2L)
//                .reduce(1,(x,y)->x*y);
                .reduce(1,Math::multiplyExact);
        return answer;
    }
    public int solution3(int[] numbers){
        int answer = 0;
        answer = Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
//                .mapToInt(Integer::intValue)
                .limit(2L)
//                .reduce(1,(x,y)->x*y);
                .reduce(1,Math::multiplyExact);
        return answer;
    }
}
