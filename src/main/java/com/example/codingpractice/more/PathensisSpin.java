package com.example.codingpractice.more;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.Collectors;

public class PathensisSpin {

    public int solution(String s) {
        int answer = 0;

        //홀수개는 통과
        if(s.length()%2==1) return 0;

        Queue<Character> queue = new LinkedList<>();
        for(char c : s.toCharArray()) queue.offer(c);

        for(int i = 0 ; i < s.length() ; i++) {

            if(isOk(queue)) answer++;
            queue.offer(queue.poll());
        }

        return answer;
    }

    public boolean isOk(Queue<Character> queue) {

        List<Character> testData = queue.stream().collect(Collectors.toList());
        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i < testData.size() ; i++) {
            if(testData.get(i)=='[' || testData.get(i)=='{' || testData.get(i)=='(')
                stack.push(testData.get(i));
            else {
                if(stack.isEmpty()) return false;
                else if(stack.peek()=='[' && testData.get(i)!=']') return false;
                else if(stack.peek()=='{' && testData.get(i)!='}') return false;
                else if(stack.peek()=='(' && testData.get(i)!=')') return false;

                stack.pop();
            }
        }
        return true;
    }
}
