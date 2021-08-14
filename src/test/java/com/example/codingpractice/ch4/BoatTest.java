package com.example.codingpractice.ch4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoatTest {

    @Test
    void solution() {

        Boat boat = new Boat();
        Assertions.assertEquals(3, boat.solution(new int[]{70, 40, 50, 60, 50}, 100));
        Assertions.assertEquals(3, boat.solution(new int[]{70, 80, 50}, 100));
    }
}
