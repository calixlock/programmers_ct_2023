package com.ll.level0.p120839;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public String solution (String rsp){
        String answer = "";
        String[] arr = rsp.split("");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("0")) arr[i]="5";
            else if(arr[i].equals("2")) arr[i]="0";
            else arr[i]="2";
            answer+=arr[i];
        }
        return answer;
    }
    public String solution2 (String rsp){
        return Arrays.stream(rsp.split(""))
                .map(e -> e.equals("2") ? "0" : e.equals("0") ? "5" : "2" )
                .collect(Collectors.joining());
    }
    public String solution3 (String rsp ){
        String answer = "";
        String[] rspArr = rsp.split("");
        for (String str: rspArr
             ) {
            switch (str){
                case "2":
                    answer += "0";
                    break;
                case "0":
                    answer += "5";
                    break;
                case "5":
                    answer += "2";
                    break;
            }
        }return answer;
    }
}
