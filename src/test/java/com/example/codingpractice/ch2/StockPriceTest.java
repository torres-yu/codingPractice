package com.example.codingpractice.ch2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StockPriceTest {

    @Test
    void solution() {


        StockPrice stockPrice = new StockPrice();
        int[] answer = stockPrice.solution(new int[]{1, 2, 3, 2, 3});
        Assertions.assertEquals(4, answer[0]);
        Assertions.assertEquals(3, answer[1]);
        Assertions.assertEquals(1, answer[2]);
        Assertions.assertEquals(1, answer[3]);
        Assertions.assertEquals(0, answer[4]);
    }
}
