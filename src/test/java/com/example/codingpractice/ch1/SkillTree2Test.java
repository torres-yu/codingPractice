package com.example.codingpractice.ch1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SkillTree2Test {

    @Test
    void solution() {

        SkillTree2 skillTree2 = new SkillTree2();
        Assertions.assertEquals(2, skillTree2.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"}));
    }
}
