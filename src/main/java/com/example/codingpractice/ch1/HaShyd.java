package com.example.codingpractice.ch1;

//하샤드수 : 숫자 / 모든자리의 합 이 나누어 떨어지는 수(문자열로 푸는 방식)
public class HaShyd {

    public boolean solution(int x) {
        char[] charArray = String.valueOf(x).toCharArray();
        int addition = 0;
        for(int i = 0 ; i < charArray.length ; i++) {
            addition += Character.getNumericValue(charArray[i]);
        }
        return x%addition==0;
    }
    //String을 람다방식으로
    // /10 %10으로 나눠가면서 while문
    //각 프로세스 별 메서드를 만든다.
}
