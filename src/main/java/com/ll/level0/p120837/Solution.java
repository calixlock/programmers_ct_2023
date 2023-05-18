package com.ll.level0.p120837;

public class Solution {
    public int solution(int hp) {
        int answer = 0;
        int[] attackList = new int[]{5,3,1};
        for (int attack :
                attackList) {
            answer += hp/attack;
            hp %= attack;
        }
        return answer;
    }
}
