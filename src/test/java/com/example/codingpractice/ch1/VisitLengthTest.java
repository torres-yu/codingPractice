package com.example.codingpractice.ch1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VisitLengthTest {

    @Test
    void solution() {

        VisitLength visitLength = new VisitLength();
        Assertions.assertEquals(7, visitLength.solution("ULURRDLLU"));
        Assertions.assertEquals(7, visitLength.solution("LULLLLLLU"));
    }
}
