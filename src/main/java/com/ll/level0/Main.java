package com.ll.level0;
import com.ll.level0.p181888.Solution;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
//        System.out.println(sol.solution(new int[]{1, 2, 3, 4, 5}));
//        System.out.println(sol.solution(new int[]{58, 44, 27, 10, 100},139));
//        System.out.println(Arrays.toString(sol.solution(new int[]{3, 4, 5, 2, 1})));
//        System.out.println(sol.solution(new int[]{3, 4, 5, 2, 1},1,3));
//        System.out.println(sol.solution2("i love you"));
//        System.out.println(sol.solution(4,12));
//        System.out.println(sol.solution2(new int[]{1, 2, 7, 10, 11}));
//        System.out.println(sol.solution2("aAb1B2cC34oOp"));
//        final String str = "aAb1B2cC34oOp";
//        str.chars().forEach(System.out::println);
//        final String str = "aAb1B2cC34oOp";
//        System.out.println((str.chars().mapToObj(i -> (char) i).filter(Character::isDigit).map(String::valueOf).mapToInt(Integer::valueOf).sum()));
//        System.out.println(sol.solution4(new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 10}));
        System.out.println(sol.solution(new int[]{4, 2, 6, 1, 7, 6},4));
    }
}
