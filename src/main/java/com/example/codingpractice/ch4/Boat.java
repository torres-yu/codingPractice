package com.example.codingpractice.ch4;

import java.util.Arrays;

public class Boat {

    public int solution(int[] people, int limit) {

        int answer = 0;

        Arrays.sort(people);

        int min = 0;
        for(int i = people.length-1 ; i >= min ; i--) {
            if(people[i] + people[min] <= limit) {
                min++;
            }
            answer++;
        }

        return answer;
    }
}
