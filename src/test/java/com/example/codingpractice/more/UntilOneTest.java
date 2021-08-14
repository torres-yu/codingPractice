package com.example.codingpractice.more;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UntilOneTest {

    @Test
    void solution() {

        UntilOne s = new UntilOne();
        Assertions.assertEquals(3, s.solution("110010101001")[0]);
        Assertions.assertEquals(8, s.solution("110010101001")[1]);
    }
}
