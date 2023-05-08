package com.ll.level0.p120841;

public class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int x = dot[0];
        int y = dot[1];
        if(x>0 && y>0) return 1;
        else if(x<0 && y>0) return 2;
        else if(x<0 && y<0) return 3;
        else if(x>0 && y<0) return 4;
        return answer;
    }
    public int solution2(int[] dot) {
        int answer = 0;
        int x = dot[0];
        int y = dot[1];
        if (x>0){
            if (y>0){
                return 1;
            }else return 4;
        }else {
            if (y>0){
                return 2;
            }else return 3;
        }
    }
}
