package com.ll.level0.p120831;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class solTests {
    @Test
    @DisplayName("case1 : 30")
    void t1(){
        assertThat(new Solution().solution(10)).isEqualTo(30);
    }
    @Test
    @DisplayName("case1 : 6")
    void t2(){
        assertThat(new Solution().solution(4)).isEqualTo(6);
    }
}
