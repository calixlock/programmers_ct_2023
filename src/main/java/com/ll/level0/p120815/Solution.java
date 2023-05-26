package com.ll.level0.p120815;

public class Solution {
    public int solution(int n) {
        int pizza = 6;
        int count = 0;
        int ans;
        while(true){
            pizza = pizza % n;
            count++;
            if(pizza == 0){ break;}
            pizza += 6;
        }
        return count;
    }
    public int solution2(int n) {
        int ans = 1;
        while(true){
            if(ans*6%n == 0) break;
            ans ++;
        }
        return ans;
    }
    public int solution3(int n) {
        int ans = 1;
        while(ans*6%n != 0){
            ans ++;
        }
        return ans;
    }
}
