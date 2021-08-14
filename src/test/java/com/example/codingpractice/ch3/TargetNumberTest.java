package com.example.codingpractice.ch3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TargetNumberTest {

    @Test
    void solution() {

        TargetNumber targetNumber = new TargetNumber();
        Assertions.assertEquals(5, targetNumber.solution(new int[]{1, 1, 1, 1, 1}, 3));
    }
}
