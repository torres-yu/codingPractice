package com.example.codingpractice.ch2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberTest {

    @Test
    void solution() {
        PhoneNumber phoneNumber = new PhoneNumber();
        Assertions.assertEquals(false, phoneNumber.solution(new String[]{"1195524421", "97674223", "119"}));
        Assertions.assertEquals(true, phoneNumber.solution(new String[]{"123","456","789"}));
        Assertions.assertEquals(false, phoneNumber.solution(new String[]{"12","123","1235","567","88"}));

    }
}
