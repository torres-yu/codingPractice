package com.example.codingpractice.ch3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoreHotTest {

    @Test
    void testSolution() {

        MoreHot moreHot = new MoreHot();
        Assertions.assertEquals(2,moreHot.solution(new int[]{12, 10, 9, 3, 2, 1}, 7));
        Assertions.assertEquals(-1,moreHot.solution(new int[]{1, 2, 3, 9, 10, 12}, 1000));
    }
}
