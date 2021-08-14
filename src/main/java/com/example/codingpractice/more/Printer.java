package com.example.codingpractice.more;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {

    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Print> prints = new LinkedList<>();

        for(int i = 0 ; i < priorities.length ; i++) {
            prints.offer(new Print(priorities[i],i));
        }

        int cnt = 0;
        while(!prints.isEmpty()) {
            Print pr = prints.poll();

            //가장 큰수가 아닌지 확인이 필요
            if(isBigger(priorities, pr.getPriority())) {
                prints.offer(pr);
            } else {
                cnt++;
                priorities[pr.getIndex()] = 0;
                if(pr.getIndex()==location)
                    answer = cnt;
            }
        }

        return answer;
    }

    public boolean isBigger(int[] priorities, int n){

        for(int i = 0 ; i < priorities.length ; i++) {
            if(n < priorities[i]) return true;
        }
        return false;
    }
}

class Print {

    private int priority;
    private int index;

    Print(int priority, int index) {
        this.priority = priority;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getPriority() {
        return priority;
    }
}
