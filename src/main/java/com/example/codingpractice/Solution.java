package com.example.codingpractice;

import java.util.Stack;

class Solution {

    private int ok;

    public String solution(String p) {

        return method(p);
    }

    private String method(String p) {

        if(p.equals("")) return p;

        boolean correct = isOk(p);

        String u = p.substring(0, ok);
        String v = p.substring(ok);

        if(correct)
            return u + method(v);

        return '('+method(v)+')' + method2(u);
    }

    public String method2(String p) {
        String answer = "";

        for(int i = 1 ; i < p.length() - 1 ; i++) {

            if (p.charAt(i) == '(')
                answer += ')';
            else
                answer += '(';
        }
        return answer;
    }

    private boolean isOk(String s) {

        Stack<Character> stack = new Stack<>();
        int left = 0;
        int right = 0;
        boolean ret = true;

        for(int i = 0 ; i < s.length() ; i++) {
            if(s.charAt(i)=='(') {
                left++;
                stack.push(s.charAt(i));
            } else {
                right++;
                if(stack.isEmpty()) {
                    ret = false;
                } else {
                    stack.pop();
                }
            }
            if(left==right) {
                ok=i+1;
                return ret;
            }
        }
        return true;
    }
}
