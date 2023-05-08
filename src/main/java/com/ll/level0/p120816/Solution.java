package com.ll.level0.p120816;

public class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
        while(slice * answer < n){
            answer++;
        }
        return answer;
    }
    public int solution2(int slice, int n){
        return n % slice > 0 ? n/slice+1 : n/slice;
    }
    public int solution3(int slice, int n){
        return  (n+slice-1)/slice;
    }

}
