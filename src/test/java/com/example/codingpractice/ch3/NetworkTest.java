package com.example.codingpractice.ch3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NetworkTest {

    @Test
    void solution() {

        Network network = new Network();

        Assertions.assertEquals(2,network.solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
        Assertions.assertEquals(1,network.solution(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}));

    }
}
