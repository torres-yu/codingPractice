package com.example.codingpractice.ch3;

import java.util.PriorityQueue;

public class MoreHot {

    public int solution(int[] scoville, int K) {

        int answer = 0;
        int smallest;
        int secondSmallest;

        PriorityQueue<Integer> scoQueue = new PriorityQueue<>();

        for(int sco : scoville) scoQueue.offer(sco);

        while(scoQueue.peek() < K) {

            if(scoQueue.size()==1) return -1;
            smallest = scoQueue.poll();
            secondSmallest = scoQueue.poll();

            scoQueue.offer(smallest + secondSmallest*2);

            answer++;
        }

        return answer;
    }
}
