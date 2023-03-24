package com.ll.level0.p120802;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolTests {
    @Test
    @DisplayName("n1+n2연산/1,2>3")
    void t1(){
        Solution sol = new Solution();
        assertThat(sol.solution(1,2)).isEqualTo(3);
    }
    @Test
    @DisplayName("n1+n2연산/100,321>421")
    void t2(){
        Solution sol = new Solution();
        assertThat(sol.solution(100,321)).isEqualTo(421);
    }
}
