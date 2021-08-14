package com.example.codingpractice.ch4;

import java.util.Arrays;

class Imigration {

    public long solution(int n, int[] times) {

        long answer = 0;

        Arrays.sort(times);

        long minTime = times[0];
        long maxTime = n * times[times.length-1];

        while(minTime != maxTime-1) {
            long mid = (minTime + maxTime) / 2;
            int param = 0;
            for(int i = 0 ; i < times.length ; i++) {
                param += mid/times[i];

                if(param > n) break;
            }
            if(param >= n) {
                maxTime = mid;
            } else {
                minTime = mid;
            }
            if(param==n) answer = mid;
        }

        return answer;
    }
}
