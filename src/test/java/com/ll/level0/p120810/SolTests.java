package com.ll.level0.p120810;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SolTests {
    @Test
    @DisplayName("나머지 10 % 3 = 1")
    void t1(){
        Solution sol = new Solution();
        assertThat(sol.solution(10,3)).isEqualTo(1);

    }
    @Test
    @DisplayName("나머지 1000 % 33 = 10")
    void t2(){
        Solution sol = new Solution();
        assertThat(sol.solution(1000,33)).isEqualTo(10);

    }


}
