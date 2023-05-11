package com.ll.level0.p181852;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int[] numlist) {
        Arrays.sort(numlist);
        int[] answer = new int[numlist.length - 5];
        for (int i = 5; i < numlist.length; i++) {
            answer[i - 5] = numlist[i];
        }
        return answer;
    }

    public int[] solution2(int[] numlist) {
        return Arrays.stream(numlist).sorted().skip(5).toArray();
    }

    public int[] solution3(int[] numlist) {
        Arrays.sort(numlist);
//        int[] answer = Arrays.copyOfRange(numlist,5,numlist.length);
//        return answer;
        return Arrays.copyOfRange(numlist, 5, numlist.length);
    }

    public int[] solution4(int[] numlist) {
        Arrays.sort(numlist);
        return IntStream.range(5,numlist.length).map(i-> numlist[i]).toArray();
    }
}
