package com.example.codingpractice.ch2;

//2-2 주식가격
public class StockPrice {

    public int[] solution(int[] prices) {

        int[] answer = new int[prices.length];
        int seconds;

        for(int i = 0; i < prices.length ; i++) {

            seconds = 0;
            for(int j = i + 1 ; j < prices.length ; j++) {
                seconds++;
                if(prices[i] > prices[j]) break;
            }
            answer[i] = seconds;
        }

        return answer;
    }
}
