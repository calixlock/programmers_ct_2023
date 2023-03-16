package com.ll.level0.p120803;

public class Main {
    public static void main(String[] args) {
        int ans;
        ans = new Solution().solution(1,2);
        System.out.printf("%d",ans);
    }

}
class Solution {
    public int solution(int num1, int num2) {
        int answer = num1-num2;
        return answer;
    }
}