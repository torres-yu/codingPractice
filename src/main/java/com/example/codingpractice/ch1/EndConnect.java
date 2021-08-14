package com.example.codingpractice.ch1;

import java.util.HashSet;

//영어 끝말잇기
public class EndConnect {

    public int[] solution(int n, String[] words) {

        //'0'사람순, '1'게임의 턴순
        int[] answer = new int[2];

        HashSet<String> history = new HashSet<>();

        for(int i = 0 ; i < words.length ; i++) {

            //1. 글자 길이가 1보다 큰지
            //2. 처음 순서x && (전단어의 마지막 글자와 이번단어의 앞자가 동일한지)
            //3. 이전에 사용한 단어인지
            if( (words[i].length() == 1)
                || (i > 0 && words[i-1].charAt(words[i-1].length()-1)!=words[i].charAt(0))
                || (!history.add(words[i]))
            ) {
                i++;
                //마지막 사람인 경우
                if(i%n==0) {
                    answer[0] = n;
                    answer[1] = i/n;
                } else {
                    answer[0] = i%n;
                    answer[1] = i/n + 1;
                }
                break;
            }
        }

        return answer;
    }
}
