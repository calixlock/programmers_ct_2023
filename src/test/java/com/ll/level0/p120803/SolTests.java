package com.ll.level0.p120803;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolTests {
    @Test
    @DisplayName("두수의차 : 4,3 > 1")
    void t1(){
        Solution sol = new Solution();
        assertThat(sol.solution(4,3)).isEqualTo(1);
    }
    @Test
    @DisplayName("두수의차 : 987,543 > 444")
    void t2(){
        Solution sol = new Solution();
        assertThat(sol.solution(987,543)).isEqualTo(444);
    }
}
