package com.example.codingpractice.more;

public class Leo {

    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int x = 0;
        int y = 0;

        while(y < 2_000_000) {

            x = (brown+4)/2 - y;


            if((x*y - 2*x - 2*y + 4) == yellow)
                break;

            y++;
        }

        answer[0] = x;
        answer[1] = y;

        return answer;
    }
}
