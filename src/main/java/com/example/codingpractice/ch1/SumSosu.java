package com.example.codingpractice.ch1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SumSosu {

    int answer = 0;

    //콤비네이션 결과의 합을 담을 리스트
    List<Integer> numbers = new ArrayList<>();

    public int solution(int[] nums) {

        boolean[] visited = new boolean[nums.length];

        //뽑은 값의 합 추출
        combination(nums, visited, 0, 3);
        //큰 숫자순으로 정렬
        numbers.sort(Comparator.naturalOrder());

        //소스 인지 체크 하기 위한 변수
        boolean isSosu = false;
        //직전 숫자를 담을 int
        int beNum = 0;

        //뽑은 값의 최대값을 넣어 소수 찾기
        List<Integer> susu = sosuSearch(numbers.get(numbers.size()-1));

        //데이터 돌리면서 sosu가 포함된 경우 answer에 값 더해줌
        for(Integer inte : numbers) {

            //중복숫자는 타지 않도록 처리
            if(inte!=beNum) {
                beNum = inte;
                isSosu = susu.contains(inte);
            }

            if(isSosu) answer++;
        }

        return answer;
    }

    //재귀를 이용한 콤비네이션
    private void combination(int[] arr, boolean[] visited, int depth, int r) {

        if(r == 0) {
            int resNum = 0;
            for(int i = 0; i < arr.length; i++) {
                if(visited[i] == true) resNum += arr[i];
            }
            numbers.add(resNum);
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

    // 뽑은 값중 가장 큰 값을 이용하여 그 보다 작은 소수 모두 찾기
    private List<Integer> sosuSearch(int maxNum) {

        //실제 구해야 하는 값이 maxNum까지 이므로 +1을 시켜줌
        maxNum++;

        int[] nums = new int[maxNum];
        for(int i = 1 ; i < maxNum ; i++) nums[i] = i;
        List<Integer> resNums = new ArrayList<>();

        //2부터 시작해서 그의 배수들을 0으로 만든다.
        //후에 0이면 넘어가고 아니면 그의 배수들을 다시 0으로 만든다.
        for(int i = 2 ; i < maxNum; i++) {
            //이미 0이 된 숫자는 넘어감
            if(nums[i]==0) continue;

            //소수의 승으로처리(ex 5 * 5부터 진행 5의 2배, 3배, 4배는 아래서 이미 제거되었기 때문)
            for(int j= i * i; j < maxNum; j += i) nums[j] = 0;
        }

        //배열에서 0이 아닌 것들을 리스트에 담아준다.
        for(int i = 2 ; i < nums.length ; i++) {
            if(nums[i]!=0) resNums.add(nums[i]);
        }

        return resNums;
    }
}


