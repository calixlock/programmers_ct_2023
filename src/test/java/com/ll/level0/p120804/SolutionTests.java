package com.ll.level0.p120804;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolutionTests {
    @Test
    @DisplayName("10 , 20 = 200")
    void t1(){
//        Solution sol = new Solution();
        assertThat(new Solution().solution(10,20)).isEqualTo(200);
    }
    @Test
    @DisplayName("20 , 40 = 800")
    void t2(){
//        Solution sol = new Solution();
        assertThat(new Solution().solution(20,40)).isEqualTo(800);
    }
    @Test
    @DisplayName("30 , 40 = 1200")
    void t3(){
//        Solution sol = new Solution();
        assertThat(new Solution().solution(30,40)).isEqualTo(3000);
    }
}
