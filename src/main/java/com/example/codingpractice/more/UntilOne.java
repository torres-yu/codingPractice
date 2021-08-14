package com.example.codingpractice.more;

public class UntilOne {

    public int[] solution(String s) {
        int[] answer = new int[2];

        int count = 0;

        while(!s.equals("1")) {

            for(char c : s.toCharArray()) {
                if (c == '1') count++;
                else answer[1]++;
            }


            s = Integer.toBinaryString(count);
            count=0;

            answer[0]++;
        }

        return answer;
    }
}
