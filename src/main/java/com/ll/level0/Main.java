package com.ll.level0;

import com.ll.level0.p181871.Solution;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        Solution sol = new Solution();
//        System.out.println(sol.solution(new solution("43 + 12"));
//        System.out.println(new Solution().solution(new int[][]{{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81}}));
//        System.out.println(new Solution().solution("xdxccxbbbxaaaaxx"));
//        System.out.println(new Solution().solution("xabcxdefxghi"));
//        System.out.println(Arrays.deepToString(new Solution().solution2(3)));
//        System.out.println(Arrays.deepToString(new int[3][3]));
//
//        System.out.println(new Solution().solution("aaaa","aa"));

//        System.out.println(new Solution().solution2("apporoograpemmemprs",new int[]{1, 16, 6, 15, 0, 10, 11, 3}) );

        String answer = "BCad";
        char[] c = answer.toLowerCase().toCharArray();
        System.out.printf("c = " + c +"\n");
        System.out.println("arr c = " + Arrays.toString(c));
        Arrays.sort(c);
        String cc = new String(Arrays.toString(c));
        System.out.println("cc = " + cc);
        
        String abc = "AdSsaDdsFZ";
        String[] arr = abc.split("");
//        Arrays.sort(arr);
//        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        String aa = new String(Arrays.toString(arr));
//        System.out.println("aa = " + aa);


//        long start = System.currentTimeMillis();
//        System.out.println(start);
//        SimpleDateFormat dateTime = new SimpleDateFormat("yyyy-mm-dd hh-mm-ss");
//        String startTime = dateTime.format(new Date(start));
//        System.out.println(startTime);
    }
}
