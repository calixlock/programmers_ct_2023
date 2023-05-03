package com.ll.level0.p181884;

import java.util.Arrays;

public class Solution {
    public int solution(int[] numbers, int n) {
        int limitValue = n;
        int answer = 0;
        for (int i:numbers) {
            if (limitValue >= answer) {
                answer += i;
            }
            else break;
        }
        return answer;
    }
    public int solution2(int[] numbers, int n) {
        return Arrays.stream(numbers).reduce(0, (sum,i) -> n >= sum ? sum+i : sum  );
    }
    public int solution3(int[] numbers, int n) {
        int i = 0;
        int sum = 0;
        while(sum <=n){
            sum += numbers[i++];
        }
        return sum;
    }
}
