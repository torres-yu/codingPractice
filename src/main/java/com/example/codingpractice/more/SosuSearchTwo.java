package com.example.codingpractice.more;

import java.util.HashSet;
import java.util.Set;

public class SosuSearchTwo {

    private Set<Integer> numberList = new HashSet<>();
    private StringBuilder nS = new StringBuilder();
    private int answer;

    public int solution(String numbers) {

        answer = 0;
        char[] cArray = new char[numbers.length()];
        boolean[] visited = new boolean[numbers.length()];

        for(int i = 0 ; i < numbers.length() ; i++)
            cArray[i] = numbers.charAt(i);

        for(int i = 0 ; i < numbers.length() ; i++) {
            bbogi(cArray, visited, 0, i + 1);
        }

        int maxNum = numberList.stream().mapToInt(Integer::intValue).max().getAsInt();
        sosuSearch(numberList, maxNum);

        return answer;
    }

    private void bbogi(char[] chars, boolean[] visited, int depth, int cnt) {

        if(depth==cnt) {
            numberList.add(Integer.parseInt(nS.toString()));
            return;
        }

        for(int i = 0 ; i < chars.length ; i++) {

            if(visited[i]) continue;

            visited[i] = true;
            nS.append(chars[i]);
            bbogi(chars, visited, depth+1, cnt);
            nS.deleteCharAt(depth);
            visited[i] = false;
        }
    }

    // 뽑은 값중 가장 큰 값을 이용하여 그 보다 작은 소수 모두 찾기
    private void sosuSearch(Set<Integer> real, int maxNum) {

        //실제 구해야 하는 값이 maxNum까지 이므로 +1을 시켜줌
        maxNum++;

        int[] nums = new int[maxNum];
        for(int i = 1 ; i < maxNum ; i++) nums[i] = i;

        //2부터 시작해서 그의 배수들을 0으로 만든다.
        //후에 0이면 넘어가고 아니면 그의 배수들을 다시 0으로 만든다.
        nums[1] = 0;
        for(int i = 2 ; i < maxNum; i++) {
            //이미 0이 된 숫자는 넘어감
            if(nums[i]==0) continue;

            //소수의 승으로처리(ex 5 * 5부터 진행 5의 2배, 3배, 4배는 아래서 이미 제거되었기 때문)
            for(int j= 2 * i; j < maxNum; j += i) nums[j] = 0;
        }

        for(int in : real)
            if(nums[in]!=0) answer++;
    }
}
