package com.example.codingpractice.more;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathensisSpinTest {

    @Test
    void solution() {

        PathensisSpin ps = new PathensisSpin();
        Assertions.assertEquals(3,ps.solution("[](){}"));
    }
}
