package com.example.codingpractice.more;

import java.util.*;

public class ThinkBrian {

    public String solution(String sentence) {
        String answer = "";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        //대문자는 들어 올 수 없음.
        char gu;
        char temp = 'a';
        int type = 1;

        //초기 대문자가 아닌 문자를 넣어줌.
        if(isDae(sentence.charAt(0))) {
            temp = sentence.charAt(0);
            gu = sentence.charAt(1);
        } else {
            gu = sentence.charAt(0);
            type = 2;
        }

        stack.push(sentence.charAt(0));
        for(int i = 1; i <sentence.length() ; i++) {

            char th = sentence.charAt(i);
            //대->소
            if(isDae(stack.peek()) && !isDae(th)) {

                if (type==2)
                    queue.offer(stack.pop());

                if(th!=gu) {
                    if(!isDae(temp)) {
                        queue.offer(stack.pop());
                        queue.offer(' ');
                        type = 2;
                    }
                    gu = th;
                }

                //대->대
            } else if(isDae(stack.peek()) && isDae(th)) {

                if(type==1 && isDae(temp)) return "invalid";

                temp = stack.pop();
                queue.offer(temp);

                if(type==1) {
                    queue.offer(' ');
                }

                //소->대
            } else if(!isDae(stack.peek()) && isDae(th)) {

                temp = stack.pop();

                if(type==1) {
                    queue.offer(stack.pop());
                } else {
                    if(i < sentence.length()-2 && temp!=sentence.charAt(i+1) && !isDae(sentence.charAt(i+1)))
                        type = 1;
                }

                //소->소
            } else {
                return "invalid";
            }

            stack.push(sentence.charAt(i));
        }

        if(type==1 && !isDae(stack.peek())) return "invalid";
        else if(type==1 && isDae(stack.peek())) queue.offer(stack.pop());
        else if(type==2 && isDae(stack.peek())) return "invalid";

        while (!queue.isEmpty()) answer+=queue.poll();
        return answer;
    }

    public boolean isDae(char c) {

        if(c > 64 && c < 91) return true;
        return false;
    }
}
