package com.example.codingpractice.more;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SosuSearchTwoTest {

    @Test
    void solution() {

        SosuSearchTwo s = new SosuSearchTwo();
        Assertions.assertEquals(5, s.solution("123"));
    }
}
