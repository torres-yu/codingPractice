package com.example.codingpractice.ch4;

public class ThreeNTile {

    public int solution(int n) {
        int answer = 0;

        int percent = 1_000_000_007;

        int junjun = 3;
        int jun = 11;

        for(int i = 6 ; i <= n ; i+=2) {
            answer = (junjun * 2 + jun * 3)%percent;
            junjun = jun;
            jun = answer;
        }

        return answer;
    }
}
