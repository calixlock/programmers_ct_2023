package com.ll.level0.p120829;

public class Solution {
    public int solution(int angle){
        int ans;
        if (0 < angle && angle < 90 ) {ans= 1;}
        else if (angle == 90) {ans = 2;}
        else if (90 < angle && angle < 180 ) {ans = 3;}
        else {ans = 4;}
        return ans;
    }
    public int solution2(int angle){
        return angle == 180 ? 4 : angle > 90 ? 3 : angle == 90 ? 2 : angle < 90 ? 1 : 0;
    }
}
