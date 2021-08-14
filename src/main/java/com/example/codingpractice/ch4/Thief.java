package com.example.codingpractice.ch4;

public class Thief {

    public int solution(int[] money) {

        int first[] = new int[money.length-1];
        int second[] = new int[money.length];

        first[0] = money[0];
        first[1] = money[0];
        second[0] = 0;
        second[1] = money[1];

        for(int i = 2 ; i < money.length -1 ; i++)
            first[i] = Math.max(first[i-2]+money[i], first[i-1]);

        for(int i = 2 ; i < money.length ; i++)
            second[i] = Math.max(second[i-2]+money[i], second[i-1]);

        return Math.max(first[money.length-2], second[money.length-1]);
    }
}
