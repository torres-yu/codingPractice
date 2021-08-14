package com.example.codingpractice.ch2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DevelopTest {

    @Test
    void solution() {
        Develop develop = new Develop();
        int[] answer = develop.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
        Assertions.assertEquals(2,answer[0]);
        Assertions.assertEquals(1,answer[1]);

        answer = develop.solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});
        Assertions.assertEquals(1,answer[0]);
        Assertions.assertEquals(3,answer[1]);
        Assertions.assertEquals(2,answer[2]);
    }
}
