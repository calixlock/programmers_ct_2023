package com.ll.level0.p120829;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class solTests {
    @Test
    @DisplayName("case1 : 1")
    void t1(){
        assertThat(new Solution().solution(70)).isEqualTo(1);
    }
    @Test
    @DisplayName("case2 : 2")
    void t2(){
        assertThat(new Solution().solution(90)).isEqualTo(2);
    }
    @Test
    @DisplayName("case3 : 3")
    void t3(){
        assertThat(new Solution().solution(130)).isEqualTo(3);
    }
}
