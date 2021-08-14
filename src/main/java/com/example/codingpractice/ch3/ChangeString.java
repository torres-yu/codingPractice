package com.example.codingpractice.ch3;

import java.util.LinkedList;
import java.util.Queue;

public class ChangeString {

    private boolean[] marked;

    public int solution(String begin, String target, String[] words) {

        marked = new boolean[words.length];

        //bfs로 탐색중 가장 먼저 끝나는 순서 리턴
        return dfs(begin, target, words);
    }

    private int dfs(String begin, String target, String[] words) {

        Queue<St> stStack = new LinkedList<>();
        stStack.offer(new St(begin, 0));

        while(!stStack.isEmpty()) {

            St s = stStack.poll();
            if(s.getSt().equals(target)) return s.getCnt();

            //구현
            for(int i = 0 ; i < words.length ; i++) {

                if(marked[i]==true) continue;

                int tempCnt = 0;
                for(int j = 0 ; j < s.getSt().length() ; j++) {
                    if(s.getSt().charAt(j)!=words[i].charAt(j)) tempCnt++;
                }
                if(tempCnt == 1) {
                    marked[i] = true;
                    stStack.offer(new St(words[i], s.getCnt()+1));
                }
            }
            System.out.println("checkedPoint");
        }
        return 0;
    }
}

class St {

    private String st;
    private int cnt;

    St(String st, int cnt) {
        this.st = st;
        this.cnt = cnt;
    }

    public String getSt() {
        return st;
    }

    public int getCnt() {
        return cnt;
    }
}
