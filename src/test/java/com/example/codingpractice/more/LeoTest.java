package com.example.codingpractice.more;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeoTest {

    @Test
    void solution() {

        Leo leo = new Leo();
        Assertions.assertEquals(4,leo.solution(10, 2)[0]);
    }
}
