package com.ll.level0.p181865;

import java.util.Arrays;

public class Solution {
    //     '+', '-', '*'
    public int solution(String binomial) {
        int answer = 0;
        String[] arrStr = binomial.split(" ");
//        int n1 = Integer.valueOf(arrStr[0]);
        int n1 = Integer.parseInt(arrStr[0]);
//        int n2 = Integer.valueOf(arrStr[2]);
        int n2 = Integer.parseInt(arrStr[2]);
        String op = arrStr[1];
//        switch (op) {
//            case "+":
//                return n1 + n2;
//            case "-":
//                return n1 - n2;
//            case "*":
//                return n1 * n2;
//        }

//        if (op.equals("+")) return answer = n1+n2;
//        else if (op.equals("-")) return answer = n1-n2;
//        else return n1*n2;
        return op.equals("+") ? n1 + n2 : op.equals("-") ? n1 - n2 : n1 * n2;
    }
}
