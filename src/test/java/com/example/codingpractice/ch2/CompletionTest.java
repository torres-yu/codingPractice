package com.example.codingpractice.ch2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompletionTest {

    @Test
    void solution() {

        Completion completion = new Completion();
        Assertions.assertEquals("leo", completion.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
        Assertions.assertEquals("vinko", completion.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}));
        Assertions.assertEquals("mislav", completion.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
    }
}
