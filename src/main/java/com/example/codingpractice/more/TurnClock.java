package com.example.codingpractice.more;

import java.util.PriorityQueue;

//범위 내의 숫자르 시계방향으로 회전하고 대상값중 최소값을 뽑기
public class TurnClock {

    public int[] solution(int rows, int columns, int[][] queries) {

        int[] answer = new int[queries.length];
        int[] ints = new int[rows * columns + 1];

        int nowPoint;
        int tempPoint;

        for(int i = 0 ; i < ints.length ; i++) ints[i] = i;

        for(int i = 0 ; i < queries.length ; i++) {

            PriorityQueue<Integer> integers = new PriorityQueue<>();

            //쿼리스의 값으로 작업을 해봅시다.
            //오른쪽
            tempPoint = ints[(queries[i][0]-1) * columns + queries[i][1]];
            for(int j = queries[i][1] ; j < queries[i][3] ; j++){
                nowPoint = tempPoint;
                tempPoint = ints[(queries[i][0]-1) * columns + (j+1)];
                ints[(queries[i][0]-1) * columns + (j+1)] = nowPoint;
                integers.offer(nowPoint);
            }

            //아래
            for(int j = queries[i][0] ; j < queries[i][2] ; j++){
                nowPoint = tempPoint;
                tempPoint = ints[(j) * columns + queries[i][3]];
                ints[(j) * columns + queries[i][3]] = nowPoint;
                integers.offer(nowPoint);
            }

            //왼쪽
            for(int j = queries[i][3] ; j > queries[i][1] ; j--){
                nowPoint = tempPoint;
                tempPoint = ints[(queries[i][2]-1) * columns + (j-1)];
                ints[(queries[i][2]-1) * columns + (j-1)] = nowPoint;
                integers.offer(nowPoint);
            }

            //위
            for(int j = queries[i][2] ; j > queries[i][0] ; j--){
                nowPoint = tempPoint;
                tempPoint = ints[(j-2) * columns + queries[i][1]];
                ints[(j-2) * columns + queries[i][1]] = nowPoint;
                integers.offer(nowPoint);
            }

            answer[i] = integers.poll();
        }


        return answer;
    }
}
