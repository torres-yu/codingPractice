package com.example.codingpractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {

        Solution s = new Solution();
        //Assertions.assertEquals("(()())()"	, s.solution("(()())()"));
        //Assertions.assertEquals("()(())()", s.solution("()))((()"));

        //Assertions.assertEquals("775841", s.solution("4177252841", 4));
        //Assertions.assertEquals("3234", s.solution("1231234", 3));

        Assertions.assertEquals("()(())()", s.solution("()))((()"));


        //Assertions.assertEquals(2, s.solution(new String[]{"frodo", "fradi", "crodo", "abc123", "frodoc"}, new String[]{"fr*d*", "abc1**"}));
        //Assertions.assertEquals("HELLO WORLD", s.solution("HaEaLaLaObWORLDb"));
        //Assertions.assertEquals(3, s.solution(new String[]{"frodo", "fradi", "crodo", "abc123", "frodoc"}, new String[]{"fr*d*", "*rodo", "******", "******"}));

        //Assertions.assertEquals(4, s.solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500})[0]);
        //Assertions.assertEquals(1, s.solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500})[1]);
        //Assertions.assertEquals(3, s.solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500})[2]);
        //Assertions.assertEquals(0, s.solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500})[3]);

    }
}
