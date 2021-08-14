package com.example.codingpractice.ch4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThiefTest {

    @Test
    void solution() {

        Thief thief = new Thief();
        Assertions.assertEquals(4, thief.solution(new int[]{1, 2, 3, 1}));
    }
}
