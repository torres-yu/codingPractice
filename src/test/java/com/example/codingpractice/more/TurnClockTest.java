package com.example.codingpractice.more;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TurnClockTest {

    @Test
    void solution() {

        TurnClock s = new TurnClock();

        Assertions.assertEquals(8, s.solution(6,6,new int[][]{{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}})[0]);
        Assertions.assertEquals(10, s.solution(6,6,new int[][]{{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}})[1]);
        Assertions.assertEquals(25, s.solution(6,6,new int[][]{{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}})[2]);

        Assertions.assertEquals(1, s.solution(3,3,new int[][]{{1, 1, 2, 2}, {1, 2, 2, 3}, {2, 1, 3, 2}, {2, 2, 3, 3}})[0]);
        Assertions.assertEquals(1, s.solution(3,3,new int[][]{{1, 1, 2, 2}, {1, 2, 2, 3}, {2, 1, 3, 2}, {2, 2, 3, 3}})[1]);
        Assertions.assertEquals(5, s.solution(3,3,new int[][]{{1, 1, 2, 2}, {1, 2, 2, 3}, {2, 1, 3, 2}, {2, 2, 3, 3}})[2]);
        Assertions.assertEquals(3, s.solution(3,3,new int[][]{{1, 1, 2, 2}, {1, 2, 2, 3}, {2, 1, 3, 2}, {2, 2, 3, 3}})[3]);

        Assertions.assertEquals(1, s.solution(100,97,new int[][]{{1, 1, 100, 97}})[0]);
    }
}
