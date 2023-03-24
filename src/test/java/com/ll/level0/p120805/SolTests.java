package com.ll.level0.p120805;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolTests {
    @Test
    @DisplayName("t1_10/3=3")
    void t1(){
        Solution sol = new Solution();
        assertThat(sol.solution(10,3)).isEqualTo(3);
    }
    @Test
    @DisplayName("t2_10/4=2")
    void t2(){
        Solution sol = new Solution();
        assertThat(sol.solution(10,4)).isEqualTo(2);
    }
}
