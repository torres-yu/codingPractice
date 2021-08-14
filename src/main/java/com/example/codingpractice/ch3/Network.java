package com.example.codingpractice.ch3;

public class Network {

    private boolean[] marked;
    private int answer;

    public int solution(int n, int[][] computers) {

        answer = 0;
        marked = new boolean[computers.length];

        for(int i = 0 ; i < computers.length ; i++) {

            if(marked[i]) continue;

            dfs(computers , i, 0);
            answer++;
        }

        return answer;
    }

    void dfs(int[][] computers, int cnt, int order) {

        for(int i = 0 ; i < computers.length ; i++) {

            if(cnt == i || marked[i]) continue;

            if(computers[cnt][i]==1) {
                marked[i] = true;
                dfs(computers, i, order + 1);
            }
        }
    }
}
