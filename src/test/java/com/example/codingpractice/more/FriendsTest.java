package com.example.codingpractice.more;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FriendsTest {

    @Test
    void solution() {

        Friends f = new Friends();
        Assertions.assertEquals("ABCD",f.solution(3,3,new String[]{"DBA", "C*A", "CDB"}));
        Assertions.assertEquals("RYAN",f.solution(2,4,new String[]{"NRYN", "ARYA"}));
        Assertions.assertEquals("MUZI",f.solution(4,4,new String[]{".ZI.", "M.**", "MZU.", ".IU."}));
        Assertions.assertEquals("IMPOSSIBLE",f.solution(2,2,new String[]{"AB", "BA"}));
        Assertions.assertEquals("IMPOSSIBLE",f.solution(3,5,new String[]{"AB.BC", ".DA.*","...DC"}));
    }
}
