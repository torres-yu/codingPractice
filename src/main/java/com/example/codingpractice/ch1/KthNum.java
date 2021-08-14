package com.example.codingpractice.ch1;

import java.util.Arrays;

// K번째수
public class KthNum {

    public int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        for(int i = 0 ; i < commands.length ; i++) {

            int[] tmp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(tmp);
            answer[i] = tmp[commands[i][2] - 1];
        }

        return answer;
    }
}



//Arrays.equals(answer, answer);
//Arrays.copyOfRange(commands, commands[0][0] - 1, commands[0][1]);



