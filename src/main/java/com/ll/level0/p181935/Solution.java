package com.ll.level0.p181935;

import java.util.stream.IntStream;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int odd = 0;
        int even = 0;
        for (int i = 0; i <= n; i++) {
            odd += i % 2 != 0 ? i : 0;
            even += i % 2 == 0 ? i * i : 0;
        }
        answer = n%2==0?even:odd;
        return answer;
    }
    public int solution2(int n) {
        if(n%2 ==0){
            return IntStream.rangeClosed(1,n)
                    .filter(i->i%2==0)
                    .map(i->i*i)
                    .sum();
        }
        else{
            return IntStream.rangeClosed(1,n)
                    .filter(i->i%2==1)
                    .sum();
        }
    }
    public int solution3(int n) {
        return n%2!=0 ? IntStream.iterate(  1,i->i<=n,i->i+2)
                .sum() : IntStream.iterate(2, i->i<=n,i->i+2)
                                .map(e->e*e)
                                .sum();
    }
}
