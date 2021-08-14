package com.example.codingpractice.ch2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisguiseTest {

    @Test
    void solution() {

        Disguise disguise = new Disguise();
        Assertions.assertEquals(5, disguise.solution(new String[][]{{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}}));
        Assertions.assertEquals(3, disguise.solution(new String[][]{{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}}));
    }
}
