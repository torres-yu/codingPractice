package com.example.codingpractice.ch3;

import java.util.ArrayList;
import java.util.List;

public class TargetNumber {

    //콤비네이션 결과의 합을 담을 리스트
    List<Integer> sum = new ArrayList<>();

    public int solution(int[] numbers, int target) {
        int answer = 0;

        boolean[] visited = new boolean[numbers.length];

        //뽑은 값의 합 추출
        for(int i = 0 ; i <= numbers.length ; i++) {

            combination(numbers, visited, 0, i);
            for(Integer in : sum) {
                if(in==target) answer++;
            }
            sum = new ArrayList<>();
        }

        return answer;
    }

    //재귀를 이용한 콤비네이션
    private void combination(int[] arr, boolean[] visited, int depth, int r) {

        if(r == 0) {
            int resNum = 0;
            for(int i = 0; i < arr.length; i++) {
                if(visited[i] == true) resNum -= arr[i];
                else resNum += arr[i];
            }
            sum.add(resNum);
            return;
        }

        if(depth == arr.length) {
            return;
        } else {
            visited[depth] = true;
            combination(arr, visited, depth + 1, r - 1);

            visited[depth] = false;
            combination(arr, visited, depth + 1, r);
        }
    }
}


