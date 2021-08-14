package com.example.codingpractice.ch1;

//하샤드수 : 숫자 / 모든자리의 합 이 나누어 떨어지는 수(숫자로 푸는 방식)
public class HaShyd2 {

    public boolean solution(int x) {

        int sumNumOfDigis = 0;
        int tmpX = x;
        while(tmpX > 0) {

            sumNumOfDigis += tmpX%10;
            tmpX /= 10;
        }

        return x%sumNumOfDigis==0;
    }
}
