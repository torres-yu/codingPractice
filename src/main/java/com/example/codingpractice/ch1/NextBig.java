package com.example.codingpractice.ch1;

public class NextBig {

    public int solution(int n) {

        int binCountN = Integer.bitCount(n);
        while(binCountN!=Integer.bitCount(++n));
        return n;
    }
}
