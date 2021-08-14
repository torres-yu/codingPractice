package com.example.codingpractice.ch3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChangeStringTest {

    @Test
    void solution() {

        ChangeString string = new ChangeString();
        Assertions.assertEquals(4, string.solution("hit","cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"}));
        //Assertions.assertEquals(0, string.solution("hit","cog", new String[]{"hot", "dot", "dog", "lot", "log"}));
    }
}
