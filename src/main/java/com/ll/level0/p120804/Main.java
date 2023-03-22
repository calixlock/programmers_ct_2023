package com.ll.level0.p120804;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(10,20)); //200
        System.out.println(new Solution().solution(20,40)); //200

    }

}
class Solution{
    public int solution(int n1, int n2){
        return n1 * n2;
    }
}