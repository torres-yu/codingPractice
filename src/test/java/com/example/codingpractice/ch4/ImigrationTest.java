package com.example.codingpractice.ch4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImigrationTest {

    @Test
    void solution() {

        Imigration i = new Imigration();
        Assertions.assertEquals(21, i.solution(5, new int[]{7,10}));
    }
}
