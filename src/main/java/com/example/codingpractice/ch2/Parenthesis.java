package com.example.codingpractice.ch2;

//2-1올바른 괄호
public class Parenthesis {

    public boolean solution(String s) {

        int zeroIsTrue = 0;

        for(char sChar : s.toCharArray()) {

            if(sChar=='(') zeroIsTrue++;
            else {
                if(zeroIsTrue == 0) return false;
                zeroIsTrue--;
            }
        }

        return zeroIsTrue==0;
    }
}
