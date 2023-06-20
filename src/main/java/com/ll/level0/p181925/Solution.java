package com.ll.level0.p181925;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for (int i = 1; i < numLog.length; i++) {
            answer += cal(numLog[i] - numLog[i - 1]);
        }
        return answer;
    }

    public String cal(int num) {
        switch (num) {
            case 1:
                return "w";
            case -1:
                return "s";
            case 10:
                return "d";
            default:
                return "a";
        }
    }

    public String solution2(int[] numLog) {
        String answer = "";
        for (int i = 1; i < numLog.length; i++) {
            switch (numLog[i] - numLog[i - 1]) {
                case 1:
                    answer += "w";
                    break;
                case -1:
                    answer += "s";
                    break;
                case 10:
                    answer += "d";
                    break;
                default:
                    answer += "a";
                    break;
            }
        }
        return answer;
    }

    public String solution3(int[] numLog) {
        String answer = "";
        for (int i = 1; i < numLog.length; i++) {
            int temp = numLog[i] - numLog[i - 1];
            answer += (temp == 1 ?  "w" : temp == -1 ?"s" : temp == 10 ? "d" : "a");
        }
        return answer;
    }
    public String solution4(int[] numLog){
        HashMap<Integer,String> cal = new HashMap<>();
        cal.put(1,"w");
        cal.put(-1,"s");
        cal.put(10,"d");
        cal.put(-10,"a");
        cal.get(1);

        return IntStream.range(1,numLog.length)
                .mapToObj(e -> cal.get(numLog[e]-numLog[e-1]))
                .collect(Collectors.joining());
    }
}
